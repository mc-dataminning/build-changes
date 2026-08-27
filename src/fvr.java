import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fvr {
   private final fvw a = new fvw();
   private final fvx b;
   private final fvl.a c;
   private final fvl.a d;
   private final fvm e;

   public fvr(int $$0) {
      this.b = fvx.a($$0);
      SortedMap<fvt, erv> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fwa.h(), this.a.a(fvt.c()));
         $$0x.put(fwa.i(), this.a.a(fvt.e()));
         $$0x.put(fwa.a(), this.a.a(fvt.d()));
         $$0x.put(fwa.k(), this.a.a(fvt.f()));
         a($$0x, fwa.b());
         a($$0x, fwa.c());
         a($$0x, fwa.d());
         a($$0x, fwa.e());
         a($$0x, fwa.f());
         $$0x.put(fwa.g(), new erv(786432));
         a($$0x, fvt.j());
         a($$0x, fvt.k());
         a($$0x, fvt.m());
         a($$0x, fvt.n());
         a($$0x, fvt.l());
         a($$0x, fvt.o());
         a($$0x, fvt.p());
         a($$0x, fvt.i());
         giy.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fvl.a(new erv(1536));
      this.c = fvl.a($$1, new erv(786432));
      this.e = new fvm(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fvt, erv> $$0, fvt $$1) {
      $$0.put($$1, new erv($$1.G()));
   }

   public fvw a() {
      return this.a;
   }

   public fvx b() {
      return this.b;
   }

   public fvl.a c() {
      return this.c;
   }

   public fvl.a d() {
      return this.d;
   }

   public fvm e() {
      return this.e;
   }
}
