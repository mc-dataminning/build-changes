import javax.annotation.Nullable;

public interface geg extends gej {
   @Deprecated
   @Override
   default float call(cng $$0, @Nullable foe $$1, @Nullable bmo $$2, int $$3) {
      return aup.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cng var1, @Nullable foe var2, @Nullable bmo var3, int var4);
}
