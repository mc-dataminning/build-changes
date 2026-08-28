import java.util.List;
import java.util.function.Function;

public class gwj<S extends gzh, M extends gby<S>> extends gwq<S, M> {
   private final aku a;
   private final gwj.a<S> b;
   private final gwj.b<S, M> c;
   private final Function<aku, gmf> d;
   private final boolean e;

   public gwj(gty<S, M> $$0, aku $$1, gwj.a<S> $$2, gwj.b<S, M> $$3, Function<aku, gmf> $$4, boolean $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public void a(ffs $$0, glv $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.z || this.e) {
         if (this.a($$3)) {
            ffw $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.u);
            int $$8 = axj.a(ayy.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gtc.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gfa> $$1 = this.c.getPartsToDraw(this.d(), $$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         this.d().f().forEach($$0x -> $$0x.l = true);
         $$1.forEach($$0x -> $$0x.l = false);
         return true;
      }
   }

   private void a() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a<S extends gzh> {
      float apply(S var1, float var2);
   }

   public interface b<S extends gzh, M extends gby<S>> {
      List<gfa> getPartsToDraw(M var1, S var2);
   }
}
