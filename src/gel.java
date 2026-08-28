import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gel {
   private final geq a = new geq();
   private final ger b;
   private final gef.a c;
   private final gef.a d;
   private final geg e;

   public gel(int $$0) {
      this.b = ger.a($$0);
      SortedMap<gen, faj> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(geu.h(), this.a.a(gen.c()));
         $$0x.put(geu.i(), this.a.a(gen.e()));
         $$0x.put(geu.a(), this.a.a(gen.d()));
         $$0x.put(geu.k(), this.a.a(gen.f()));
         a($$0x, geu.b());
         a($$0x, geu.c());
         a($$0x, geu.d());
         a($$0x, geu.e());
         a($$0x, geu.f());
         $$0x.put(geu.g(), new faj(786432));
         a($$0x, gen.j());
         a($$0x, gen.k());
         a($$0x, gen.m());
         a($$0x, gen.n());
         a($$0x, gen.l());
         a($$0x, gen.o());
         a($$0x, gen.p());
         a($$0x, gen.i());
         grw.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gef.a(new faj(1536));
      this.c = gef.a($$1, new faj(786432));
      this.e = new geg(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gen, faj> $$0, gen $$1) {
      $$0.put($$1, new faj($$1.I()));
   }

   public geq a() {
      return this.a;
   }

   public ger b() {
      return this.b;
   }

   public gef.a c() {
      return this.c;
   }

   public gef.a d() {
      return this.d;
   }

   public geg e() {
      return this.e;
   }
}
