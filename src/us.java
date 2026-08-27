import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class us implements tj {
   public static final Object[] b = new Object[0];
   private static final tm c = tm.e("%");
   private static final tm d = tm.e("null");
   private final String e;
   @Nullable
   private final String f;
   private final Object[] g;
   @Nullable
   private qp h;
   private List<tm> i = ImmutableList.of();
   private static final Pattern j = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   public us(String $$0, @Nullable String $$1, Object[] $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   private void d() {
      qp $$0 = qp.a();
      if ($$0 != this.h) {
         this.h = $$0;
         String $$1 = this.f != null ? $$0.a(this.e, this.f) : $$0.a(this.e);

         try {
            Builder<tm> $$2 = ImmutableList.builder();
            this.a($$1, $$2::add);
            this.i = $$2.build();
         } catch (ut var4) {
            this.i = ImmutableList.of(tm.e($$1));
         }
      }
   }

   private void a(String $$0, Consumer<tm> $$1) {
      Matcher $$2 = j.matcher($$0);

      try {
         int $$3 = 0;
         int $$4 = 0;

         while ($$2.find($$4)) {
            int $$5 = $$2.start();
            int $$6 = $$2.end();
            if ($$5 > $$4) {
               String $$7 = $$0.substring($$4, $$5);
               if ($$7.indexOf(37) != -1) {
                  throw new IllegalArgumentException();
               }

               $$1.accept(tm.e($$7));
            }

            String $$8 = $$2.group(2);
            String $$9 = $$0.substring($$5, $$6);
            if ("%".equals($$8) && "%%".equals($$9)) {
               $$1.accept(c);
            } else {
               if (!"s".equals($$8)) {
                  throw new ut(this, "Unsupported format: '" + $$9 + "'");
               }

               String $$10 = $$2.group(1);
               int $$11 = $$10 != null ? Integer.parseInt($$10) - 1 : $$3++;
               $$1.accept(this.a($$11));
            }

            $$4 = $$6;
         }

         if ($$4 < $$0.length()) {
            String $$12 = $$0.substring($$4);
            if ($$12.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            $$1.accept(tm.e($$12));
         }
      } catch (IllegalArgumentException var12) {
         throw new ut(this, var12);
      }
   }

   private tm a(int $$0) {
      if ($$0 >= 0 && $$0 < this.g.length) {
         Object $$1 = this.g[$$0];
         if ($$1 instanceof ti) {
            return (ti)$$1;
         } else {
            return $$1 == null ? d : tm.e($$1.toString());
         }
      } else {
         throw new ut(this, $$0);
      }
   }

   @Override
   public <T> Optional<T> a(tm.b<T> $$0, ue $$1) {
      this.d();

      for (tm $$2 : this.i) {
         Optional<T> $$3 = $$2.a($$0, $$1);
         if ($$3.isPresent()) {
            return $$3;
         }
      }

      return Optional.empty();
   }

   @Override
   public <T> Optional<T> a(tm.a<T> $$0) {
      this.d();

      for (tm $$1 : this.i) {
         Optional<T> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   @Override
   public tv a(@Nullable dt $$0, @Nullable bil $$1, int $$2) throws CommandSyntaxException {
      Object[] $$3 = new Object[this.g.length];

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         Object $$5 = this.g[$$4];
         if ($$5 instanceof ti) {
            $$3[$$4] = tk.a($$0, (ti)$$5, $$1, $$2);
         } else {
            $$3[$$4] = $$5;
         }
      }

      return tv.a(new us(this.e, this.f, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof us $$1 && Objects.equals(this.e, $$1.e) && Objects.equals(this.f, $$1.f) && Arrays.equals(this.g, $$1.g)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = Objects.hashCode(this.e);
      $$0 = 31 * $$0 + Objects.hashCode(this.f);
      return 31 * $$0 + Arrays.hashCode(this.g);
   }

   @Override
   public String toString() {
      return "translation{key='" + this.e + "'" + (this.f != null ? ", fallback='" + this.f + "'" : "") + ", args=" + Arrays.toString(this.g) + "}";
   }

   public String a() {
      return this.e;
   }

   @Nullable
   public String b() {
      return this.f;
   }

   public Object[] c() {
      return this.g;
   }
}
