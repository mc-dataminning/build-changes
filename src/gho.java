import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gho {
   private final ght a = new ght();
   private final ghu b;
   private final ghg.a c;
   private final ghg.a d;
   private final ghi e;

   public gho(int $$0) {
      this.b = ghu.a($$0);
      SequencedMap<ghq, fdb> $$1 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gib.h(), this.a.a(ghq.c()));
         $$0x.put(gib.i(), this.a.a(ghq.e()));
         $$0x.put(gib.a(), this.a.a(ghq.d()));
         $$0x.put(gib.j(), this.a.a(ghq.f()));
         a($$0x, gib.b());
         a($$0x, gib.c());
         a($$0x, gib.d());
         a($$0x, gib.e());
         a($$0x, gib.f());
         $$0x.put(gib.g(), new fdb(786432));
         a($$0x, ghq.j());
         a($$0x, ghq.l());
         a($$0x, ghq.k());
         a($$0x, ghq.m());
         a($$0x, ghq.i());
      });
      this.c = ghg.a($$1, new fdb(786432));
      this.e = new ghi(this.c);
      SequencedMap<ghq, fdb> $$2 = ad.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> gzk.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = ghg.a($$2, new fdb(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<ghq, fdb> $$0, ghq $$1) {
      $$0.put($$1, new fdb($$1.M()));
   }

   public ght a() {
      return this.a;
   }

   public ghu b() {
      return this.b;
   }

   public ghg.a c() {
      return this.c;
   }

   public ghg.a d() {
      return this.d;
   }

   public ghi e() {
      return this.e;
   }
}
