import javax.annotation.Nullable;

public interface gxg extends gxj {
   @Deprecated
   @Override
   default float call(cwb $$0, @Nullable gci $$1, @Nullable bva $$2, int $$3) {
      return azk.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cwb var1, @Nullable gci var2, @Nullable bva var3, int var4);
}
