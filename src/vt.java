import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.bytes.ByteCollection;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class vt implements vs {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 8;
   private static final ByteCollection c = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private static final n d = n.l;
   private static final n e = n.k;
   private static final n f = n.g;
   private static final n g = n.m;
   private static final Pattern h = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String i = String.valueOf(':');
   private static final String j = String.valueOf(',');
   private static final String k = "[";
   private static final String l = "]";
   private static final String m = ";";
   private static final String n = " ";
   private static final String o = "{";
   private static final String p = "}";
   private static final String q = "\n";
   private final String r;
   private final int s;
   private xl t = xk.a;

   public vt(String $$0, int $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public xl a(vo $$0) {
      $$0.a(this);
      return this.t;
   }

   @Override
   public void a(vm $$0) {
      String $$1 = vm.b($$0.s_());
      String $$2 = $$1.substring(0, 1);
      xl $$3 = xl.b($$1.substring(1, $$1.length() - 1)).a(e);
      this.t = xl.b($$2).b($$3).f($$2);
   }

   @Override
   public void a(up $$0) {
      xl $$1 = xl.b("b").a(g);
      this.t = xl.b(String.valueOf($$0.l())).b($$1).a(f);
   }

   @Override
   public void a(vj $$0) {
      xl $$1 = xl.b("s").a(g);
      this.t = xl.b(String.valueOf($$0.l())).b($$1).a(f);
   }

   @Override
   public void a(uw $$0) {
      this.t = xl.b(String.valueOf($$0.l())).a(f);
   }

   @Override
   public void a(uz $$0) {
      xl $$1 = xl.b("L").a(g);
      this.t = xl.b(String.valueOf($$0.l())).b($$1).a(f);
   }

   @Override
   public void a(uu $$0) {
      xl $$1 = xl.b("f").a(g);
      this.t = xl.b(String.valueOf($$0.k())).b($$1).a(f);
   }

   @Override
   public void a(us $$0) {
      xl $$1 = xl.b("d").a(g);
      this.t = xl.b(String.valueOf($$0.j())).b($$1).a(f);
   }

   @Override
   public void a(uo $$0) {
      xl $$1 = xl.b("B").a(g);
      xz $$2 = xl.b("[").b($$1).f(";");
      byte[] $$3 = $$0.e();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         xz $$5 = xl.b(String.valueOf($$3[$$4])).a(f);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(uv $$0) {
      xl $$1 = xl.b("I").a(g);
      xz $$2 = xl.b("[").b($$1).f(";");
      int[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$2.f(" ").b(xl.b(String.valueOf($$3[$$4])).a(f));
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(uy $$0) {
      xl $$1 = xl.b("L").a(g);
      xz $$2 = xl.b("[").b($$1).f(";");
      long[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         xl $$5 = xl.b(String.valueOf($$3[$$4])).a(f);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(ux $$0) {
      if ($$0.isEmpty()) {
         this.t = xl.b("[]");
      } else if (c.contains($$0.f()) && $$0.size() <= 8) {
         String $$1 = j + " ";
         xz $$2 = xl.b("[");

         for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
            if ($$3 != 0) {
               $$2.f($$1);
            }

            $$2.b(new vt(this.r, this.s).a($$0.k($$3)));
         }

         $$2.f("]");
         this.t = $$2;
      } else {
         xz $$4 = xl.b("[");
         if (!this.r.isEmpty()) {
            $$4.f("\n");
         }

         for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
            xz $$6 = xl.b(Strings.repeat(this.r, this.s + 1));
            $$6.b(new vt(this.r, this.s + 1).a($$0.k($$5)));
            if ($$5 != $$0.size() - 1) {
               $$6.f(j).f(this.r.isEmpty() ? " " : "\n");
            }

            $$4.b($$6);
         }

         if (!this.r.isEmpty()) {
            $$4.f("\n").f(Strings.repeat(this.r, this.s));
         }

         $$4.f("]");
         this.t = $$4;
      }
   }

   @Override
   public void a(ur $$0) {
      if ($$0.g()) {
         this.t = xl.b("{}");
      } else {
         xz $$1 = xl.b("{");
         Collection<String> $$2 = $$0.e();
         if (a.isDebugEnabled()) {
            List<String> $$3 = Lists.newArrayList($$0.e());
            Collections.sort($$3);
            $$2 = $$3;
         }

         if (!this.r.isEmpty()) {
            $$1.f("\n");
         }

         Iterator<String> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            String $$5 = $$4.next();
            xz $$6 = xl.b(Strings.repeat(this.r, this.s + 1)).b(a($$5)).f(i).f(" ").b(new vt(this.r, this.s + 1).a($$0.c($$5)));
            if ($$4.hasNext()) {
               $$6.f(j).f(this.r.isEmpty() ? " " : "\n");
            }

            $$1.b($$6);
         }

         if (!this.r.isEmpty()) {
            $$1.f("\n").f(Strings.repeat(this.r, this.s));
         }

         $$1.f("}");
         this.t = $$1;
      }
   }

   protected static xl a(String $$0) {
      if (h.matcher($$0).matches()) {
         return xl.b($$0).a(d);
      } else {
         String $$1 = vm.b($$0);
         String $$2 = $$1.substring(0, 1);
         xl $$3 = xl.b($$1.substring(1, $$1.length() - 1)).a(d);
         return xl.b($$2).b($$3).f($$2);
      }
   }

   @Override
   public void a(ut $$0) {
      this.t = xk.a;
   }
}
