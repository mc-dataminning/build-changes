import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class gjf {
   private final gjk a = new gjk();
   private final gjl b;
   private final gix.a c;
   private final gix.a d;
   private final giz e;

   public gjf(int $$0) {
      this.b = gjl.a($$0);
      SequencedMap<gjh, feh> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gjs.h(), this.a.a(gjh.c()));
         $$0x.put(gjs.i(), this.a.a(gjh.e()));
         $$0x.put(gjs.a(), this.a.a(gjh.d()));
         $$0x.put(gjs.j(), this.a.a(gjh.f()));
         a($$0x, gjs.b());
         a($$0x, gjs.c());
         a($$0x, gjs.d());
         a($$0x, gjs.e());
         a($$0x, gjs.f());
         $$0x.put(gjs.g(), new feh(786432));
         a($$0x, gjh.j());
         a($$0x, gjh.l());
         a($$0x, gjh.k());
         a($$0x, gjh.m());
         a($$0x, gjh.i());
      });
      this.c = gix.a($$1, new feh(786432));
      this.e = new giz(this.c);
      SequencedMap<gjh, feh> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hbf.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = gix.a($$2, new feh(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gjh, feh> $$0, gjh $$1) {
      $$0.put($$1, new feh($$1.M()));
   }

   public gjk a() {
      return this.a;
   }

   public gjl b() {
      return this.b;
   }

   public gix.a c() {
      return this.c;
   }

   public gix.a d() {
      return this.d;
   }

   public giz e() {
      return this.e;
   }
}
