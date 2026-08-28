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
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ib<T extends em<T>> implements hy<T> {
   private static final DecimalFormat a = ag.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, ia<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final alk e;
   private final List<ib.a<T>> f;

   public ib(alk $$0, List<ib.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public alk a() {
      return this.e;
   }

   @Override
   public ia<T> a(@Nullable ua $$0, CommandDispatcher<T> $$1) throws en {
      if ($$0 == null) {
         throw new en(xc.a("commands.function.error.missing_arguments", xc.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            va $$4 = $$0.a($$3);
            if ($$4 == null) {
               throw new en(xc.a("commands.function.error.missing_argument", xc.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         ia<T> $$5 = (ia<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            ia<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static String a(va $$0) {
      Objects.requireNonNull($$0);
      Throwable var30;
      switch ($$0) {
         case ud var3:
            ud var40 = var3;

            try {
               var41 = var40.n();
            } catch (Throwable var23) {
               var30 = var23;
               boolean var46 = false;
               break;
            }

            float var24 = var41;
            return a.format((double)var24);
         case ub var5:
            ub var38 = var5;

            try {
               var39 = var38.n();
            } catch (Throwable var22) {
               var30 = var22;
               boolean var45 = false;
               break;
            }

            double var25 = var39;
            return a.format(var25);
         case ty var8:
            ty var36 = var8;

            try {
               var37 = var36.n();
            } catch (Throwable var21) {
               var30 = var21;
               boolean var44 = false;
               break;
            }

            byte var26 = var37;
            return String.valueOf((int)var26);
         case ut var10:
            ut var34 = var10;

            try {
               var35 = var34.n();
            } catch (Throwable var20) {
               var30 = var20;
               boolean var43 = false;
               break;
            }

            short var27 = var35;
            return String.valueOf((int)var27);
         case ui var12:
            ui var32 = var12;

            try {
               var33 = var32.n();
            } catch (Throwable var19) {
               var30 = var19;
               boolean var42 = false;
               break;
            }

            long var28 = var33;
            return String.valueOf(var28);
         case uy var15:
            uy var29 = var15;

            try {
               var31 = var29.k();
            } catch (Throwable var18) {
               var30 = var18;
               boolean var10001 = false;
               break;
            }

            return var31;
         default:
            return $$0.toString();
      }

      Throwable var1 = var30;
      throw new MatchException(var1.toString(), var1);
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private ia<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws en {
      List<hp<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ib.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ic<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hp<T> a(List<String> var1, CommandDispatcher<T> var2, alk var3) throws en;
   }

   static class b<T extends em<T>> implements ib.a<T> {
      private final id a;
      private final IntList b;
      private final T c;

      public b(id $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hp<T> a(List<String> $$0, CommandDispatcher<T> $$1, alk $$2) throws en {
         String $$3 = this.a.a($$0);

         try {
            return hy.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new en(xc.a("commands.function.error.parse", xc.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ib.a<T> {
      private final hp<T> a;

      public c(hp<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hp<T> a(List<String> $$0, CommandDispatcher<T> $$1, alk $$2) {
         return this.a;
      }
   }
}
