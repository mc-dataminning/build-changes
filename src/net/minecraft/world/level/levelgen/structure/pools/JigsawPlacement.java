package net.minecraft.world.level.levelgen.structure.pools;

import java.util.List;
import java.util.Optional;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.apache.commons.lang3.mutable.MutableObject;

// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException
//   at java.base/java.util.Objects.requireNonNull(Objects.java:220)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.rename(VarDefinitionHelper.java:2035)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1822)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:2029)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:2029)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:2029)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1619)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1739)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1584)
//   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
//   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:145)
//   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:379)
//   at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:521)
//   at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:200)
//   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:221)
