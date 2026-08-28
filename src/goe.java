import javax.annotation.Nullable;

public interface goe extends goh {
   @Deprecated
   @Override
   default float call(cup $$0, @Nullable fxv $$1, @Nullable btp $$2, int $$3) {
      return ayz.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cup var1, @Nullable fxv var2, @Nullable btp var3, int var4);
}
