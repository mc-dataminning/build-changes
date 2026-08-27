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

public class tl implements tk {
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
   private vb t = va.a;

   public tl(String $$0, int $$1) {
      this.r = $$0;
      this.s = $$1;
   }

   public vb a(tg $$0) {
      $$0.a(this);
      return this.t;
   }

   @Override
   public void a(te $$0) {
      String $$1 = te.b($$0.t_());
      String $$2 = $$1.substring(0, 1);
      vb $$3 = vb.b($$1.substring(1, $$1.length() - 1)).a(e);
      this.t = vb.b($$2).b($$3).f($$2);
   }

   @Override
   public void a(sh $$0) {
      vb $$1 = vb.b("b").a(g);
      this.t = vb.b(String.valueOf($$0.l())).b($$1).a(f);
   }

   @Override
   public void a(tb $$0) {
      vb $$1 = vb.b("s").a(g);
      this.t = vb.b(String.valueOf($$0.l())).b($$1).a(f);
   }

   @Override
   public void a(so $$0) {
      this.t = vb.b(String.valueOf($$0.l())).a(f);
   }

   @Override
   public void a(sr $$0) {
      vb $$1 = vb.b("L").a(g);
      this.t = vb.b(String.valueOf($$0.l())).b($$1).a(f);
   }

   @Override
   public void a(sm $$0) {
      vb $$1 = vb.b("f").a(g);
      this.t = vb.b(String.valueOf($$0.k())).b($$1).a(f);
   }

   @Override
   public void a(sk $$0) {
      vb $$1 = vb.b("d").a(g);
      this.t = vb.b(String.valueOf($$0.j())).b($$1).a(f);
   }

   @Override
   public void a(sg $$0) {
      vb $$1 = vb.b("B").a(g);
      vp $$2 = vb.b("[").b($$1).f(";");
      byte[] $$3 = $$0.e();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         vp $$5 = vb.b(String.valueOf($$3[$$4])).a(f);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(sn $$0) {
      vb $$1 = vb.b("I").a(g);
      vp $$2 = vb.b("[").b($$1).f(";");
      int[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$2.f(" ").b(vb.b(String.valueOf($$3[$$4])).a(f));
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(sq $$0) {
      vb $$1 = vb.b("L").a(g);
      vp $$2 = vb.b("[").b($$1).f(";");
      long[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         vb $$5 = vb.b(String.valueOf($$3[$$4])).a(f);
         $$2.f(" ").b($$5).b($$1);
         if ($$4 != $$3.length - 1) {
            $$2.f(j);
         }
      }

      $$2.f("]");
      this.t = $$2;
   }

   @Override
   public void a(sp $$0) {
      if ($$0.isEmpty()) {
         this.t = vb.b("[]");
      } else if (c.contains($$0.f()) && $$0.size() <= 8) {
         String $$1 = j + " ";
         vp $$2 = vb.b("[");

         for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
            if ($$3 != 0) {
               $$2.f($$1);
            }

            $$2.b(new tl(this.r, this.s).a($$0.k($$3)));
         }

         $$2.f("]");
         this.t = $$2;
      } else {
         vp $$4 = vb.b("[");
         if (!this.r.isEmpty()) {
            $$4.f("\n");
         }

         for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
            vp $$6 = vb.b(Strings.repeat(this.r, this.s + 1));
            $$6.b(new tl(this.r, this.s + 1).a($$0.k($$5)));
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
   public void a(sj $$0) {
      if ($$0.g()) {
         this.t = vb.b("{}");
      } else {
         vp $$1 = vb.b("{");
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
            vp $$6 = vb.b(Strings.repeat(this.r, this.s + 1)).b(a($$5)).f(i).f(" ").b(new tl(this.r, this.s + 1).a($$0.c($$5)));
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

   protected static vb a(String $$0) {
      if (h.matcher($$0).matches()) {
         return vb.b($$0).a(d);
      } else {
         String $$1 = te.b($$0);
         String $$2 = $$1.substring(0, 1);
         vb $$3 = vb.b($$1.substring(1, $$1.length() - 1)).a(d);
         return vb.b($$2).b($$3).f($$2);
      }
   }

   @Override
   public void a(sl $$0) {
      this.t = va.a;
   }
}
