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
   private static final int c = 64;
   private static final ByteCollection d = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private static final n e = n.l;
   private static final n f = n.k;
   private static final n g = n.g;
   private static final n h = n.m;
   private static final Pattern i = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String j = String.valueOf(':');
   private static final String k = String.valueOf(',');
   private static final String l = "[";
   private static final String m = "]";
   private static final String n = ";";
   private static final String o = " ";
   private static final String p = "{";
   private static final String q = "}";
   private static final String r = "\n";
   private static final xo s = xo.b("<...>").a(n.h);
   private final String t;
   private final int u;
   private final int v;
   private xo w = xn.a;

   public vt(String $$0) {
      this($$0, 0, 0);
   }

   private vt(String $$0, int $$1, int $$2) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
   }

   public xo a(vo $$0) {
      $$0.a(this);
      return this.w;
   }

   @Override
   public void a(vm $$0) {
      String $$1 = vm.b($$0.s_());
      String $$2 = $$1.substring(0, 1);
      xo $$3 = xo.b($$1.substring(1, $$1.length() - 1)).a(f);
      this.w = xo.b($$2).b($$3).f($$2);
   }

   @Override
   public void a(up $$0) {
      xo $$1 = xo.b("b").a(h);
      this.w = xo.b(String.valueOf($$0.l())).b($$1).a(g);
   }

   @Override
   public void a(vj $$0) {
      xo $$1 = xo.b("s").a(h);
      this.w = xo.b(String.valueOf($$0.l())).b($$1).a(g);
   }

   @Override
   public void a(uw $$0) {
      this.w = xo.b(String.valueOf($$0.l())).a(g);
   }

   @Override
   public void a(uz $$0) {
      xo $$1 = xo.b("L").a(h);
      this.w = xo.b(String.valueOf($$0.l())).b($$1).a(g);
   }

   @Override
   public void a(uu $$0) {
      xo $$1 = xo.b("f").a(h);
      this.w = xo.b(String.valueOf($$0.k())).b($$1).a(g);
   }

   @Override
   public void a(us $$0) {
      xo $$1 = xo.b("d").a(h);
      this.w = xo.b(String.valueOf($$0.j())).b($$1).a(g);
   }

   @Override
   public void a(uo $$0) {
      xo $$1 = xo.b("B").a(h);
      yc $$2 = xo.b("[").b($$1).f(";");
      byte[] $$3 = $$0.e();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         yc $$5 = xo.b(String.valueOf($$3[$$4])).a(g);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(k);
         }
      }

      $$2.f("]");
      this.w = $$2;
   }

   @Override
   public void a(uv $$0) {
      xo $$1 = xo.b("I").a(h);
      yc $$2 = xo.b("[").b($$1).f(";");
      int[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$2.f(" ").b(xo.b(String.valueOf($$3[$$4])).a(g));
         if ($$4 != $$3.length - 1) {
            $$2.f(k);
         }
      }

      $$2.f("]");
      this.w = $$2;
   }

   @Override
   public void a(uy $$0) {
      xo $$1 = xo.b("L").a(h);
      yc $$2 = xo.b("[").b($$1).f(";");
      long[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         xo $$5 = xo.b(String.valueOf($$3[$$4])).a(g);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(k);
         }
      }

      $$2.f("]");
      this.w = $$2;
   }

   @Override
   public void a(ux $$0) {
      if ($$0.isEmpty()) {
         this.w = xo.b("[]");
      } else if (this.v >= 64) {
         this.w = xo.b("[").b(s).f("]");
      } else if (d.contains($$0.f()) && $$0.size() <= 8) {
         String $$1 = k + " ";
         yc $$2 = xo.b("[");

         for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
            if ($$3 != 0) {
               $$2.f($$1);
            }

            $$2.b(this.a($$0.k($$3), false));
         }

         $$2.f("]");
         this.w = $$2;
      } else {
         yc $$4 = xo.b("[");
         if (!this.t.isEmpty()) {
            $$4.f("\n");
         }

         String $$5 = Strings.repeat(this.t, this.u + 1);

         for (int $$6 = 0; $$6 < $$0.size(); $$6++) {
            yc $$7 = xo.b($$5);
            $$7.b(this.a($$0.k($$6), true));
            if ($$6 != $$0.size() - 1) {
               $$7.f(k).f(this.t.isEmpty() ? " " : "\n");
            }

            $$4.b($$7);
         }

         if (!this.t.isEmpty()) {
            $$4.f("\n").f(Strings.repeat(this.t, this.u));
         }

         $$4.f("]");
         this.w = $$4;
      }
   }

   @Override
   public void a(ur $$0) {
      if ($$0.g()) {
         this.w = xo.b("{}");
      } else if (this.v >= 64) {
         this.w = xo.b("{").b(s).f("}");
      } else {
         yc $$1 = xo.b("{");
         Collection<String> $$2 = $$0.e();
         if (a.isDebugEnabled()) {
            List<String> $$3 = Lists.newArrayList($$0.e());
            Collections.sort($$3);
            $$2 = $$3;
         }

         if (!this.t.isEmpty()) {
            $$1.f("\n");
         }

         String $$4 = Strings.repeat(this.t, this.u + 1);
         Iterator<String> $$5 = $$2.iterator();

         while ($$5.hasNext()) {
            String $$6 = $$5.next();
            yc $$7 = xo.b($$4).b(a($$6)).f(j).f(" ").b(this.a($$0.c($$6), true));
            if ($$5.hasNext()) {
               $$7.f(k).f(this.t.isEmpty() ? " " : "\n");
            }

            $$1.b($$7);
         }

         if (!this.t.isEmpty()) {
            $$1.f("\n").f(Strings.repeat(this.t, this.u));
         }

         $$1.f("}");
         this.w = $$1;
      }
   }

   private xo a(vo $$0, boolean $$1) {
      return new vt(this.t, $$1 ? this.u + 1 : this.u, this.v + 1).a($$0);
   }

   protected static xo a(String $$0) {
      if (i.matcher($$0).matches()) {
         return xo.b($$0).a(e);
      } else {
         String $$1 = vm.b($$0);
         String $$2 = $$1.substring(0, 1);
         xo $$3 = xo.b($$1.substring(1, $$1.length() - 1)).a(e);
         return xo.b($$2).b($$3).f($$2);
      }
   }

   @Override
   public void a(ut $$0) {
      this.w = xn.a;
   }
}
