import javax.annotation.Nullable;

public interface fyl extends fyo {
   @Deprecated
   @Override
   default float call(cjh $$0, @Nullable fiz $$1, @Nullable bji $$2, int $$3) {
      return ary.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cjh var1, @Nullable fiz var2, @Nullable bji var3, int var4);
}
