import javax.annotation.Nullable;

public interface gwe extends gwh {
   @Deprecated
   @Override
   default float call(cvp $$0, @Nullable gbh $$1, @Nullable buk $$2, int $$3) {
      return azd.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cvp var1, @Nullable gbh var2, @Nullable buk var3, int var4);
}
