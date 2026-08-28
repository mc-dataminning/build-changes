import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class ghc {
   private final ghh a = new ghh();
   private final ghi b;
   private final ggv.a c;
   private final ggv.a d;
   private final ggw e;

   public ghc(int $$0) {
      this.b = ghi.a($$0);
      SequencedMap<ghe, fcr> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(ghm.h(), this.a.a(ghe.c()));
         $$0x.put(ghm.i(), this.a.a(ghe.e()));
         $$0x.put(ghm.a(), this.a.a(ghe.d()));
         $$0x.put(ghm.k(), this.a.a(ghe.f()));
         a($$0x, ghm.b());
         a($$0x, ghm.c());
         a($$0x, ghm.d());
         a($$0x, ghm.e());
         a($$0x, ghm.f());
         $$0x.put(ghm.g(), new fcr(786432));
         a($$0x, ghe.j());
         a($$0x, ghe.l());
         a($$0x, ghe.k());
         a($$0x, ghe.m());
         a($$0x, ghe.n());
         a($$0x, ghe.i());
      });
      this.c = ggv.a($$1, new fcr(786432));
      this.e = new ggw(this.c);
      SequencedMap<ghe, fcr> $$2 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> gyt.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = ggv.a($$2, new fcr(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<ghe, fcr> $$0, ghe $$1) {
      $$0.put($$1, new fcr($$1.N()));
   }

   public ghh a() {
      return this.a;
   }

   public ghi b() {
      return this.b;
   }

   public ggv.a c() {
      return this.c;
   }

   public ggv.a d() {
      return this.d;
   }

   public ggw e() {
      return this.e;
   }
}
