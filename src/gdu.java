import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gdu {
   private final gdz a = new gdz();
   private final gea b;
   private final gdo.a c;
   private final gdo.a d;
   private final gdp e;

   public gdu(int $$0) {
      this.b = gea.a($$0);
      SortedMap<gdw, ezt> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(ged.h(), this.a.a(gdw.c()));
         $$0x.put(ged.i(), this.a.a(gdw.e()));
         $$0x.put(ged.a(), this.a.a(gdw.d()));
         $$0x.put(ged.k(), this.a.a(gdw.f()));
         a($$0x, ged.b());
         a($$0x, ged.c());
         a($$0x, ged.d());
         a($$0x, ged.e());
         a($$0x, ged.f());
         $$0x.put(ged.g(), new ezt(786432));
         a($$0x, gdw.j());
         a($$0x, gdw.k());
         a($$0x, gdw.m());
         a($$0x, gdw.n());
         a($$0x, gdw.l());
         a($$0x, gdw.o());
         a($$0x, gdw.p());
         a($$0x, gdw.i());
         grf.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = gdo.a(new ezt(1536));
      this.c = gdo.a($$1, new ezt(786432));
      this.e = new gdp(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gdw, ezt> $$0, gdw $$1) {
      $$0.put($$1, new ezt($$1.I()));
   }

   public gdz a() {
      return this.a;
   }

   public gea b() {
      return this.b;
   }

   public gdo.a c() {
      return this.c;
   }

   public gdo.a d() {
      return this.d;
   }

   public gdp e() {
      return this.e;
   }
}
