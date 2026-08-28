import javax.annotation.Nullable;

public interface haj extends ham {
   @Deprecated
   @Override
   default float call(cxg $$0, @Nullable gff $$1, @Nullable bvx $$2, int $$3) {
      return azu.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cxg var1, @Nullable gff var2, @Nullable bvx var3, int var4);
}
