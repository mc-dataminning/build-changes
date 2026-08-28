import javax.annotation.Nullable;

public interface gpk extends gpn {
   @Deprecated
   @Override
   default float call(cuo $$0, @Nullable fyz $$1, @Nullable btl $$2, int $$3) {
      return ayn.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuo var1, @Nullable fyz var2, @Nullable btl var3, int var4);
}
