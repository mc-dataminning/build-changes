package net.minecraft.client.input;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryUtil;

public record IMECandidatesEvent(List<String> candidates, int selectedCandidate, boolean horizontal) {
   @Nullable
   public static IMECandidatesEvent fromSdl(@Nullable final PointerBuffer candidates, final int numCandidates, int selectedCandidate, final boolean horizontal) {
      if (candidates != null && numCandidates > 0) {
         selectedCandidate %= numCandidates;
         Builder<String> builder = ImmutableList.builderWithExpectedSize(numCandidates);

         for (int i = 0; i < numCandidates; i++) {
            long pointer = candidates.get(i);
            builder.add(pointer == 0L ? "" : MemoryUtil.memUTF8(pointer));
         }

         List<String> list = builder.build();
         int selected = selectedCandidate >= 0 && selectedCandidate < list.size() ? selectedCandidate : -1;
         return new IMECandidatesEvent(list, selected, horizontal);
      } else {
         return null;
      }
   }
}
