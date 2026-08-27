import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class tw implements ub {
   private static final Pattern a = Pattern.compile("[A-Za-z0-9._+-]+");
   private final StringBuilder b = new StringBuilder();

   public String a(tx $$0) {
      $$0.a(this);
      return this.b.toString();
   }

   @Override
   public void a(tv $$0) {
      this.b.append(tv.b($$0.s_()));
   }

   @Override
   public void a(sy $$0) {
      this.b.append($$0.l()).append('b');
   }

   @Override
   public void a(ts $$0) {
      this.b.append($$0.l()).append('s');
   }

   @Override
   public void a(tf $$0) {
      this.b.append($$0.l());
   }

   @Override
   public void a(ti $$0) {
      this.b.append($$0.l()).append('L');
   }

   @Override
   public void a(td $$0) {
      this.b.append($$0.k()).append('f');
   }

   @Override
   public void a(tb $$0) {
      this.b.append($$0.j()).append('d');
   }

   @Override
   public void a(sx $$0) {
      this.b.append("[B;");
      byte[] $$1 = $$0.e();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]).append('B');
      }

      this.b.append(']');
   }

   @Override
   public void a(te $$0) {
      this.b.append("[I;");
      int[] $$1 = $$0.g();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]);
      }

      this.b.append(']');
   }

   @Override
   public void a(th $$0) {
      this.b.append("[L;");
      long[] $$1 = $$0.g();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]).append('L');
      }

      this.b.append(']');
   }

   @Override
   public void a(tg $$0) {
      this.b.append('[');

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         if ($$1 != 0) {
            this.b.append(',');
         }

         this.b.append(new tw().a($$0.k($$1)));
      }

      this.b.append(']');
   }

   @Override
   public void a(ta $$0) {
      this.b.append('{');
      List<String> $$1 = Lists.newArrayList($$0.e());
      Collections.sort($$1);

      for (String $$2 : $$1) {
         if (this.b.length() != 1) {
            this.b.append(',');
         }

         this.b.append(a($$2)).append(':').append(new tw().a($$0.c($$2)));
      }

      this.b.append('}');
   }

   protected static String a(String $$0) {
      return a.matcher($$0).matches() ? $$0 : tv.b($$0);
   }

   @Override
   public void a(tc $$0) {
      this.b.append("END");
   }
}
