import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gdw {
   private final geb a = new geb();
   private final gec b;
   private final gdq.a c;
   private final gdq.a d;
   private final gdr e;

   public gdw(int $$0) {
      this.b = gec.a($$0);
      SortedMap<gdy, ezv> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gef.h(), this.a.a(gdy.c()));
         $$0x.put(gef.i(), this.a.a(gdy.e()));
         $$0x.put(gef.a(), this.a.a(gdy.d()));
         $$0x.put(gef.k(), this.a.a(gdy.f()));
         a($$0x, gef.b());
         a($$0x, gef.c());
         a($$0x, gef.d());
         a($$0x, gef.e());
         a($$0x, gef.f());
         $$0x.put(gef.g(), new ezv(786432));
         a($$0x, gdy.j());
         a($$0x, gdy.k());
         a($$0x, gdy.m());
         a($$0x, gdy.n());
         a($$0x, gdy.l());
         a($$0x, gdy.o());
         a($$0x, gdy.p());
         a($$0x, gdy.i());
         grh.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdq.a(new ezv(1536));
      this.c = gdq.a($$1, new ezv(786432));
      this.e = new gdr(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gdy, ezv> $$0, gdy $$1) {
      $$0.put($$1, new ezv($$1.I()));
   }

   public geb a() {
      return this.a;
   }

   public gec b() {
      return this.b;
   }

   public gdq.a c() {
      return this.c;
   }

   public gdq.a d() {
      return this.d;
   }

   public gdr e() {
      return this.e;
   }
}
