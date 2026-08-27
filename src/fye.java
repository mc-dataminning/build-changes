import javax.annotation.Nullable;

public interface fye extends fyh {
   @Deprecated
   @Override
   default float call(cja $$0, @Nullable fis $$1, @Nullable bjb $$2, int $$3) {
      return ars.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cja var1, @Nullable fis var2, @Nullable bjb var3, int var4);
}
