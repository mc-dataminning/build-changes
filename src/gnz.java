import javax.annotation.Nullable;

public interface gnz extends goc {
   @Deprecated
   @Override
   default float call(cuk $$0, @Nullable fxq $$1, @Nullable btk $$2, int $$3) {
      return ayu.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuk var1, @Nullable fxq var2, @Nullable btk var3, int var4);
}
