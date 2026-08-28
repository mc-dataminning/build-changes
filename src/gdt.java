import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gdt {
   private final gdy a = new gdy();
   private final gdz b;
   private final gdn.a c;
   private final gdn.a d;
   private final gdo e;

   public gdt(int $$0) {
      this.b = gdz.a($$0);
      SortedMap<gdv, ezs> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gec.h(), this.a.a(gdv.c()));
         $$0x.put(gec.i(), this.a.a(gdv.e()));
         $$0x.put(gec.a(), this.a.a(gdv.d()));
         $$0x.put(gec.k(), this.a.a(gdv.f()));
         a($$0x, gec.b());
         a($$0x, gec.c());
         a($$0x, gec.d());
         a($$0x, gec.e());
         a($$0x, gec.f());
         $$0x.put(gec.g(), new ezs(786432));
         a($$0x, gdv.j());
         a($$0x, gdv.k());
         a($$0x, gdv.m());
         a($$0x, gdv.n());
         a($$0x, gdv.l());
         a($$0x, gdv.o());
         a($$0x, gdv.p());
         a($$0x, gdv.i());
         gre.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdn.a(new ezs(1536));
      this.c = gdn.a($$1, new ezs(786432));
      this.e = new gdo(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gdv, ezs> $$0, gdv $$1) {
      $$0.put($$1, new ezs($$1.I()));
   }

   public gdy a() {
      return this.a;
   }

   public gdz b() {
      return this.b;
   }

   public gdn.a c() {
      return this.c;
   }

   public gdn.a d() {
      return this.d;
   }

   public gdo e() {
      return this.e;
   }
}
