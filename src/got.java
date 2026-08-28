import javax.annotation.Nullable;

public interface got extends gow {
   @Deprecated
   @Override
   default float call(cuc $$0, @Nullable fyj $$1, @Nullable btb $$2, int $$3) {
      return ayg.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuc var1, @Nullable fyj var2, @Nullable btb var3, int var4);
}
