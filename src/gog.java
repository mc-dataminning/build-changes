import javax.annotation.Nullable;

public interface gog extends goj {
   @Deprecated
   @Override
   default float call(cur $$0, @Nullable fxx $$1, @Nullable btr $$2, int $$3) {
      return ayz.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cur var1, @Nullable fxx var2, @Nullable btr var3, int var4);
}
