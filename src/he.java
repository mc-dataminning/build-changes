import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class he<T extends du<T>> implements hb<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hd<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final ahh e;
   private final List<he.a<T>> f;

   public he(ahh $$0, List<he.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public ahh a() {
      return this.e;
   }

   @Override
   public hd<T> a(@Nullable so $$0, CommandDispatcher<T> $$1) throws dv {
      if ($$0 == null) {
         throw new dv(vg.a("commands.function.error.missing_arguments", vg.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            tl $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new dv(vg.a("commands.function.error.missing_argument", vg.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         hd<T> $$5 = (hd<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hd<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(tl $$0) {
      if ($$0 instanceof sr $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof sp $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof sm $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof tg $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof sw $$5 ? String.valueOf($$5.f()) : $$0.t_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private hd<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws dv {
      List<gs<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (he.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new hf<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      gs<T> a(List<String> var1, CommandDispatcher<T> var2, ahh var3) throws dv;
   }

   static class b<T extends du<T>> implements he.a<T> {
      private final hg a;
      private final IntList b;
      private final T c;

      public b(hg $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public gs<T> a(List<String> $$0, CommandDispatcher<T> $$1, ahh $$2) throws dv {
         String $$3 = this.a.a($$0);

         try {
            return hb.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new dv(vg.a("commands.function.error.parse", vg.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements he.a<T> {
      private final gs<T> a;

      public c(gs<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public gs<T> a(List<String> $$0, CommandDispatcher<T> $$1, ahh $$2) {
         return this.a;
      }
   }
}
