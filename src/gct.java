import javax.annotation.Nullable;

public interface gct extends gcw {
   @Deprecated
   @Override
   default float call(cmh $$0, @Nullable fmt $$1, @Nullable blv $$2, int $$3) {
      return aty.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cmh var1, @Nullable fmt var2, @Nullable blv var3, int var4);
}
