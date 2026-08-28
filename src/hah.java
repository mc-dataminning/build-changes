import javax.annotation.Nullable;

public interface hah extends hak {
   @Deprecated
   @Override
   default float call(cxk $$0, @Nullable gfd $$1, @Nullable bwb $$2, int $$3) {
      return bae.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cxk var1, @Nullable gfd var2, @Nullable bwb var3, int var4);
}
