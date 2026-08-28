import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gdp {
   private final gdu a = new gdu();
   private final gdv b;
   private final gdj.a c;
   private final gdj.a d;
   private final gdk e;

   public gdp(int $$0) {
      this.b = gdv.a($$0);
      SortedMap<gdr, ezo> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gdy.h(), this.a.a(gdr.c()));
         $$0x.put(gdy.i(), this.a.a(gdr.e()));
         $$0x.put(gdy.a(), this.a.a(gdr.d()));
         $$0x.put(gdy.k(), this.a.a(gdr.f()));
         a($$0x, gdy.b());
         a($$0x, gdy.c());
         a($$0x, gdy.d());
         a($$0x, gdy.e());
         a($$0x, gdy.f());
         $$0x.put(gdy.g(), new ezo(786432));
         a($$0x, gdr.j());
         a($$0x, gdr.k());
         a($$0x, gdr.m());
         a($$0x, gdr.n());
         a($$0x, gdr.l());
         a($$0x, gdr.o());
         a($$0x, gdr.p());
         a($$0x, gdr.i());
         gra.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdj.a(new ezo(1536));
      this.c = gdj.a($$1, new ezo(786432));
      this.e = new gdk(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gdr, ezo> $$0, gdr $$1) {
      $$0.put($$1, new ezo($$1.I()));
   }

   public gdu a() {
      return this.a;
   }

   public gdv b() {
      return this.b;
   }

   public gdj.a c() {
      return this.c;
   }

   public gdj.a d() {
      return this.d;
   }

   public gdk e() {
      return this.e;
   }
}
