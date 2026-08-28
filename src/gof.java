import javax.annotation.Nullable;

public interface gof extends goi {
   @Deprecated
   @Override
   default float call(cuq $$0, @Nullable fxw $$1, @Nullable btq $$2, int $$3) {
      return ayz.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuq var1, @Nullable fxw var2, @Nullable btq var3, int var4);
}
