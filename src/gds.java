import javax.annotation.Nullable;

public interface gds extends gdv {
   @Deprecated
   @Override
   default float call(cmy $$0, @Nullable fns $$1, @Nullable bml $$2, int $$3) {
      return auo.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cmy var1, @Nullable fns var2, @Nullable bml var3, int var4);
}
