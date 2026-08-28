import java.util.List;
import java.util.function.Function;

public class gvr<S extends gym, M extends gbf<S>> extends gvy<S, M> {
   private final alz a;
   private final gvr.a<S> b;
   private final gvr.b<S, M> c;
   private final Function<alz, glo> d;

   public gvr(gtg<S, M> $$0, alz $$1, gvr.a<S> $$2, gvr.b<S, M> $$3, Function<alz, glo> $$4) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   public void a(fgl $$0, gle $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.u) {
         if (this.a($$3)) {
            fgp $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.p);
            int $$8 = ayp.a(bae.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, gsk.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<geh> $$1 = this.c.getPartsToDraw(this.d(), $$0);
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

   public interface a<S extends gym> {
      float apply(S var1, float var2);
   }

   public interface b<S extends gym, M extends gbf<S>> {
      List<geh> getPartsToDraw(M var1, S var2);
   }
}
