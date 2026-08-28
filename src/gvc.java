import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gvc {
   private final gsq a;
   private final gtz b;

   public gvc(gsq $$0, gtz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gvc.a a(jz $$0, gva $$1, fli $$2, gsb $$3) {
      gvc.a $$4 = new gvc.a();
      iw $$5 = $$0.j();
      iw $$6 = $$5.b(15, 15, 15);
      gve $$7 = new gve();
      fld $$8 = new fld();
      gss.a();
      Map<gry, fkz> $$9 = new Reference2ObjectArrayMap(gry.N().size());
      bai $$10 = bai.a();
      List<gsz> $$11 = new ObjectArrayList();

      for (iw $$12 : iw.c($$5, $$6)) {
         ebq $$13 = $$1.a_($$12);
         if ($$13.s()) {
            $$7.a($$12);
         }

         if ($$13.x()) {
            dyo $$14 = $$1.c_($$12);
            if ($$14 != null) {
               this.a($$4, $$14);
            }
         }

         eya $$15 = $$13.y();
         if (!$$15.c()) {
            gry $$16 = grf.a($$15);
            fkz $$17 = this.a($$9, $$3, $$16);
            this.a.a($$12, $$1, $$17, $$13, $$15);
         }

         if ($$13.o() == dub.b) {
            gry $$18 = grf.a($$13);
            fkz $$19 = this.a($$9, $$3, $$18);
            $$10.b($$13.b($$12));
            this.a.a($$13).a($$10, $$11);
            $$8.a();
            $$8.a((float)jz.b($$12.u()), (float)jz.b($$12.v()), (float)jz.b($$12.w()));
            this.a.a($$13, $$12, $$1, $$8, $$19, true, $$11);
            $$8.b();
            $$11.clear();
         }
      }

      for (Entry<gry, fkz> $$20 : $$9.entrySet()) {
         gry $$21 = $$20.getKey();
         flc $$22 = $$20.getValue().a();
         if ($$22 != null) {
            if ($$21 == gry.g()) {
               $$4.e = $$22.a($$3.a(gry.g()), $$2);
            }

            $$4.c.put($$21, $$22);
         }
      }

      gss.b();
      $$4.d = $$7.a();
      return $$4;
   }

   private fkz a(Map<gry, fkz> $$0, gsb $$1, gry $$2) {
      fkz $$3 = $$0.get($$2);
      if ($$3 == null) {
         fla $$4 = $$1.a($$2);
         $$3 = new fkz($$4, VertexFormat.b.h, flb.b);
         $$0.put($$2, $$3);
      }

      return $$3;
   }

   private <E extends dyo> void a(gvc.a $$0, E $$1) {
      gua<E> $$2 = this.b.a($$1);
      if ($$2 != null) {
         $$0.b.add($$1);
         if ($$2.a($$1)) {
            $$0.a.add($$1);
         }
      }
   }

   public static final class a {
      public final List<dyo> a = new ArrayList<>();
      public final List<dyo> b = new ArrayList<>();
      public final Map<gry, flc> c = new Reference2ObjectArrayMap();
      public gvf d = new gvf();
      @Nullable
      public flc.b e;

      public void a() {
         this.c.values().forEach(flc::close);
      }
   }
}
