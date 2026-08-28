import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class gej {
   private final geo a = new geo();
   private final gep b;
   private final ged.a c;
   private final ged.a d;
   private final gee e;

   public gej(int $$0) {
      this.b = gep.a($$0);
      SortedMap<gel, fah> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(ges.h(), this.a.a(gel.c()));
         $$0x.put(ges.i(), this.a.a(gel.e()));
         $$0x.put(ges.a(), this.a.a(gel.d()));
         $$0x.put(ges.k(), this.a.a(gel.f()));
         a($$0x, ges.b());
         a($$0x, ges.c());
         a($$0x, ges.d());
         a($$0x, ges.e());
         a($$0x, ges.f());
         $$0x.put(ges.g(), new fah(786432));
         a($$0x, gel.j());
         a($$0x, gel.k());
         a($$0x, gel.m());
         a($$0x, gel.n());
         a($$0x, gel.l());
         a($$0x, gel.o());
         a($$0x, gel.p());
         a($$0x, gel.i());
         gru.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = ged.a(new fah(1536));
      this.c = ged.a($$1, new fah(786432));
      this.e = new gee(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gel, fah> $$0, gel $$1) {
      $$0.put($$1, new fah($$1.I()));
   }

   public geo a() {
      return this.a;
   }

   public gep b() {
      return this.b;
   }

   public ged.a c() {
      return this.c;
   }

   public ged.a d() {
      return this.d;
   }

   public gee e() {
      return this.e;
   }
}
