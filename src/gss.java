import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class gss implements gsd.a {
   private final List<gss.c> a;

   gss(List<gss.c> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(eat $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gss a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hmi.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public gsd a(hlz $$0) {
      List<hmg.a> $$1 = new ArrayList<>(this.a.size());

      for (gss.c $$2 : this.a) {
         gsd $$3 = $$2.b.a($$0);
         $$1.add(new hmg.a($$2.a, $$3));
      }

      return new hmg($$1);
   }

   public static record b(List<gst> b) {
      public static final Codec<gss.b> a = ayu.b(gst.a.listOf()).xmap(gss.b::new, gss.b::a);

      public gss a(eau<dmr, eat> $$0) {
         List<gss.c> $$1 = new ArrayList<>(this.b.size());

         for (gst $$2 : this.b) {
            $$1.add(new gss.c($$2.a($$0), $$2.b()));
         }

         return new gss($$1);
      }

      public List<gst> a() {
         return this.b;
      }
   }

   static record c(Predicate<eat> a, gsi b) {
   }
}
