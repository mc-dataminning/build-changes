import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fvs {
   private final fvx a = new fvx();
   private final fvy b;
   private final fvm.a c;
   private final fvm.a d;
   private final fvn e;

   public fvs(int $$0) {
      this.b = fvy.a($$0);
      SortedMap<fvu, erv> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fwb.h(), this.a.a(fvu.c()));
         $$0x.put(fwb.i(), this.a.a(fvu.e()));
         $$0x.put(fwb.a(), this.a.a(fvu.d()));
         $$0x.put(fwb.k(), this.a.a(fvu.f()));
         a($$0x, fwb.b());
         a($$0x, fwb.c());
         a($$0x, fwb.d());
         a($$0x, fwb.e());
         a($$0x, fwb.f());
         $$0x.put(fwb.g(), new erv(786432));
         a($$0x, fvu.j());
         a($$0x, fvu.k());
         a($$0x, fvu.m());
         a($$0x, fvu.n());
         a($$0x, fvu.l());
         a($$0x, fvu.o());
         a($$0x, fvu.p());
         a($$0x, fvu.i());
         giz.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fvm.a(new erv(1536));
      this.c = fvm.a($$1, new erv(786432));
      this.e = new fvn(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fvu, erv> $$0, fvu $$1) {
      $$0.put($$1, new erv($$1.G()));
   }

   public fvx a() {
      return this.a;
   }

   public fvy b() {
      return this.b;
   }

   public fvm.a c() {
      return this.c;
   }

   public fvm.a d() {
      return this.d;
   }

   public fvn e() {
      return this.e;
   }
}
