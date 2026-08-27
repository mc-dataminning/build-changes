import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class yu implements uo<ur> {
   private final int a;
   private final List<yu.a> b;

   public yu(int $$0, Collection<bhc> $$1) {
      this.a = $$0;
      this.b = Lists.newArrayList();

      for (bhc $$2 : $$1) {
         this.b.add(new yu.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   public yu(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.a((sf.a<yu.a>)($$0x -> {
         acq $$1 = $$0x.t();
         bhb $$2 = jb.v.a($$1);
         double $$3 = $$0x.readDouble();
         List<bhe> $$4 = $$0x.a((sf.a<bhe>)($$0xx -> new bhe($$0xx.o(), "Unknown synced attribute modifier", $$0xx.readDouble(), bhe.a.a($$0xx.readByte()))));
         return new yu.a($$2, $$3, $$4);
      }));
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(this.b, ($$0x, $$1) -> {
         $$0x.a(jb.v.b($$1.a()));
         $$0x.writeDouble($$1.b());
         $$0x.a($$1.c(), ($$0xx, $$1x) -> {
            $$0xx.a($$1x.a());
            $$0xx.writeDouble($$1x.d());
            $$0xx.writeByte($$1x.c().a());
         });
      });
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public List<yu.a> c() {
      return this.b;
   }

   public static class a {
      private final bhb a;
      private final double b;
      private final Collection<bhe> c;

      public a(bhb $$0, double $$1, Collection<bhe> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public bhb a() {
         return this.a;
      }

      public double b() {
         return this.b;
      }

      public Collection<bhe> c() {
         return this.c;
      }
   }
}
