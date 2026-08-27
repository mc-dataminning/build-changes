import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fvz {
   private final fwe a = new fwe();
   private final fwf b;
   private final fvt.a c;
   private final fvt.a d;
   private final fvu e;

   public fvz(int $$0) {
      this.b = fwf.a($$0);
      SortedMap<fwb, esc> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fwi.h(), this.a.a(fwb.c()));
         $$0x.put(fwi.i(), this.a.a(fwb.e()));
         $$0x.put(fwi.a(), this.a.a(fwb.d()));
         $$0x.put(fwi.k(), this.a.a(fwb.f()));
         a($$0x, fwi.b());
         a($$0x, fwi.c());
         a($$0x, fwi.d());
         a($$0x, fwi.e());
         a($$0x, fwi.f());
         $$0x.put(fwi.g(), new esc(786432));
         a($$0x, fwb.j());
         a($$0x, fwb.k());
         a($$0x, fwb.m());
         a($$0x, fwb.n());
         a($$0x, fwb.l());
         a($$0x, fwb.o());
         a($$0x, fwb.p());
         a($$0x, fwb.i());
         gjg.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fvt.a(new esc(1536));
      this.c = fvt.a($$1, new esc(786432));
      this.e = new fvu(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fwb, esc> $$0, fwb $$1) {
      $$0.put($$1, new esc($$1.G()));
   }

   public fwe a() {
      return this.a;
   }

   public fwf b() {
      return this.b;
   }

   public fvt.a c() {
      return this.c;
   }

   public fvt.a d() {
      return this.d;
   }

   public fvu e() {
      return this.e;
   }
}
