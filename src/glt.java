import javax.annotation.Nullable;

public interface glt extends glw {
   @Deprecated
   @Override
   default float call(csd $$0, @Nullable fvm $$1, @Nullable bre $$2, int $$3) {
      return axw.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(csd var1, @Nullable fvm var2, @Nullable bre var3, int var4);
}
