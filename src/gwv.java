import javax.annotation.Nullable;

public interface gwv extends gwy {
   @Deprecated
   @Override
   default float call(cvx $$0, @Nullable gbx $$1, @Nullable buv $$2, int $$3) {
      return azj.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cvx var1, @Nullable gbx var2, @Nullable buv var3, int var4);
}
