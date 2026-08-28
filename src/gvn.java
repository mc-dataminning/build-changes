import javax.annotation.Nullable;

public interface gvn extends gvq {
   @Deprecated
   @Override
   default float call(cvl $$0, @Nullable gax $$1, @Nullable buf $$2, int $$3) {
      return azc.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cvl var1, @Nullable gax var2, @Nullable buf var3, int var4);
}
