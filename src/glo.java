import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;

public class glo {
   private final glt a = new glt();
   private final glu b;
   private final glg.a c;
   private final glg.a d;
   private final gli e;

   public glo(int $$0) {
      this.b = glu.a($$0);
      SequencedMap<glq, fgi> $$1 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(gmb.h(), this.a.a(glq.c()));
         $$0x.put(gmb.i(), this.a.a(glq.e()));
         $$0x.put(gmb.a(), this.a.a(glq.d()));
         $$0x.put(gmb.j(), this.a.a(glq.f()));
         a($$0x, gmb.b());
         a($$0x, gmb.c());
         a($$0x, gmb.d());
         a($$0x, gmb.e());
         a($$0x, gmb.f());
         $$0x.put(gmb.g(), new fgi(786432));
         a($$0x, glq.j());
         a($$0x, glq.l());
         a($$0x, glq.k());
         a($$0x, glq.m());
         a($$0x, glq.i());
      });
      this.c = glg.a($$1, new fgi(786432));
      this.e = new gli(this.c);
      SequencedMap<glq, fgi> $$2 = ae.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> hds.l.forEach($$1x -> a($$0x, $$1x)));
      this.d = glg.a($$2, new fgi(0));
   }

   private static void a(Object2ObjectLinkedOpenHashMap<glq, fgi> $$0, glq $$1) {
      $$0.put($$1, new fgi($$1.R()));
   }

   public glt a() {
      return this.a;
   }

   public glu b() {
      return this.b;
   }

   public glg.a c() {
      return this.c;
   }

   public glg.a d() {
      return this.d;
   }

   public gli e() {
      return this.e;
   }
}
