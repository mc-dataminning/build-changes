import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class grv {
   private final gsb a = new gsb();
   private final gsc b;
   private final grn.a c;
   private final grn.a d;
   private final grp e;

   public grv(int $$0) {
      this.b = gsc.a($$0);
      SequencedMap<gry, fla> $$1 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gsh.h(), this.a.a(gry.d()));
         $$0x.put(gsh.i(), this.a.a(gry.f()));
         $$0x.put(gsh.a(), this.a.a(gry.e()));
         $$0x.put(gsh.j(), this.a.a(gry.g()));
         a($$0x, gsh.b());
         a($$0x, gsh.c());
         a($$0x, gsh.d());
         a($$0x, gsh.e());
         a($$0x, gsh.f());
         $$0x.put(gsh.g(), new fla(786432));
         a($$0x, gry.k());
         a($$0x, gry.m());
         a($$0x, gry.l());
         a($$0x, gry.n());
         a($$0x, gry.j());
      });
      this.c = grn.a($$1, new fla(786432));
      this.e = new grp(this.c);
      SequencedMap<gry, fla> $$2 = ag.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hna.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = grn.a($$2, new fla(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<gry, fla> $$0, gry $$1) {
      $$0.put($$1, new fla($$1.O()));
   }

   public gsb a() {
      return this.a;
   }

   public gsc b() {
      return this.b;
   }

   public grn.a c() {
      return this.c;
   }

   public grn.a d() {
      return this.d;
   }

   public grp e() {
      return this.e;
   }
}
