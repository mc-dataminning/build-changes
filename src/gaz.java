import javax.annotation.Nullable;

public interface gaz extends gbc {
   @Deprecated
   @Override
   default float call(clj $$0, @Nullable flj $$1, @Nullable blg $$2, int $$3) {
      return atm.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(clj var1, @Nullable flj var2, @Nullable blg var3, int var4);
}
