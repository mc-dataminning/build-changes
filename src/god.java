import javax.annotation.Nullable;

public interface god extends gog {
   @Deprecated
   @Override
   default float call(cuo $$0, @Nullable fxu $$1, @Nullable bto $$2, int $$3) {
      return ayy.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cuo var1, @Nullable fxu var2, @Nullable bto var3, int var4);
}
