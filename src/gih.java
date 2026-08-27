import javax.annotation.Nullable;

public interface gih extends gik {
   @Deprecated
   @Override
   default float call(cqm $$0, @Nullable fsa $$1, @Nullable bpp $$2, int $$3) {
      return aww.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cqm var1, @Nullable fsa var2, @Nullable bpp var3, int var4);
}
