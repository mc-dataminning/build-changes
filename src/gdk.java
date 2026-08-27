import javax.annotation.Nullable;

public interface gdk extends gdn {
   @Deprecated
   @Override
   default float call(cmr $$0, @Nullable fnk $$1, @Nullable bmf $$2, int $$3) {
      return aui.a(this.unclampedCall($$0, $$1, $$2, $$3), 0.0F, 1.0F);
   }

   float unclampedCall(cmr var1, @Nullable fnk var2, @Nullable bmf var3, int var4);
}
