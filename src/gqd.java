import javax.annotation.Nullable;

public interface gqd extends gqg {
   @Deprecated
   @Override
   default float call(cuh $$0, @Nullable fzn $$1, @Nullable bso $$2, int $$3) {
      return aym.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuh var1, @Nullable fzn var2, @Nullable bso var3, int var4);
}
