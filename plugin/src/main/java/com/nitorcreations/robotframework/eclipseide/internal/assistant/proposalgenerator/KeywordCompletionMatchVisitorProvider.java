/**
 * Copyright 2012-2013 Nitor Creations Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nitorcreations.robotframework.eclipseide.internal.assistant.proposalgenerator;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.IRegion;


public class KeywordCompletionMatchVisitorProvider extends CompletionMatchVisitorProvider {

    public KeywordCompletionMatchVisitorProvider(IFile file, IRegion replacementRegion) {
        super(file, replacementRegion);
    }

    @Override
    public CompletionMatchVisitor get(String argument, List<RobotCompletionProposal> proposals) {
        return new KeywordCompletionMatchVisitor(file, argument, proposals, replacementRegion);
    }
}