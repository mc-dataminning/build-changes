import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.List;

public class gss {
   private static final jc[] a = jc.values();
   private final frs b;
   private static final int c = 100;
   static final ThreadLocal<gss.d> d = ThreadLocal.withInitial(gss.d::new);

   public gss(frs $$0) {
      this.b = $$0;
   }

   public void a(djk $$0, List<gsz> $$1, ebq $$2, iw $$3, fld $$4, flg $$5, boolean $$6, int $$7) {
      if (!$$1.isEmpty()) {
         boolean $$8 = fqq.P() && $$2.k() == 0 && $$1.getFirst().a();
         $$4.a($$2.a($$3));

         try {
            if ($$8) {
               this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            } else {
               this.c($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            }
         } catch (Throwable var13) {
            p $$10 = p.a(var13, "Tesselating block model");
            q $$11 = $$10.a("Block model being tesselated");
            q.a($$11, $$0, $$3, $$2);
            $$11.a("Using AO", $$8);
            throw new aa($$10);
         }
      }
   }

   private static boolean a(djk $$0, ebq $$1, boolean $$2, jc $$3, iw $$4) {
      if (!$$2) {
         return true;
      } else {
         ebq $$5 = $$0.a_($$4);
         return dno.a($$1, $$5, $$3);
      }
   }

   public void b(djk $$0, List<gsz> $$1, ebq $$2, iw $$3, fld $$4, flg $$5, boolean $$6, int $$7) {
      gss.b $$8 = new gss.b();
      int $$9 = 0;
      int $$10 = 0;

      for (gsz $$11 : $$1) {
         for (jc $$12 : a) {
            int $$13 = 1 << $$12.ordinal();
            boolean $$14 = ($$9 & $$13) == 1;
            boolean $$15 = ($$10 & $$13) == 1;
            if (!$$14 || $$15) {
               List<gst> $$16 = $$11.a($$12);
               if (!$$16.isEmpty()) {
                  if (!$$14) {
                     $$15 = a($$0, $$2, $$6, $$12, $$8.a.a($$3, $$12));
                     $$9 |= $$13;
                     if ($$15) {
                        $$10 |= $$13;
                     }
                  }

                  if ($$15) {
                     this.a($$0, $$2, $$3, $$4, $$5, $$16, $$8, $$7);
                  }
               }
            }
         }

         List<gst> $$17 = $$11.a(null);
         if (!$$17.isEmpty()) {
            this.a($$0, $$2, $$3, $$4, $$5, $$17, $$8, $$7);
         }
      }
   }

   public void c(djk $$0, List<gsz> $$1, ebq $$2, iw $$3, fld $$4, flg $$5, boolean $$6, int $$7) {
      gss.e $$8 = new gss.e();
      int $$9 = 0;
      int $$10 = 0;

      for (gsz $$11 : $$1) {
         for (jc $$12 : a) {
            int $$13 = 1 << $$12.ordinal();
            boolean $$14 = ($$9 & $$13) == 1;
            boolean $$15 = ($$10 & $$13) == 1;
            if (!$$14 || $$15) {
               List<gst> $$16 = $$11.a($$12);
               if (!$$16.isEmpty()) {
                  iw $$17 = $$8.a.a($$3, $$12);
                  if (!$$14) {
                     $$15 = a($$0, $$2, $$6, $$12, $$17);
                     $$9 |= $$13;
                     if ($$15) {
                        $$10 |= $$13;
                     }
                  }

                  if ($$15) {
                     int $$18 = $$8.h.a($$2, $$0, $$17);
                     this.a($$0, $$2, $$3, $$18, $$7, false, $$4, $$5, $$16, $$8);
                  }
               }
            }
         }

         List<gst> $$19 = $$11.a(null);
         if (!$$19.isEmpty()) {
            this.a($$0, $$2, $$3, -1, $$7, true, $$4, $$5, $$19, $$8);
         }
      }
   }

   private void a(djk $$0, ebq $$1, iw $$2, fld $$3, flg $$4, List<gst> $$5, gss.b $$6, int $$7) {
      for (gst $$8 : $$5) {
         a($$0, $$1, $$2, $$8.b(), $$8.d(), $$6);
         $$6.a($$0, $$1, $$2, $$8.d(), $$8.f());
         this.a($$0, $$1, $$2, $$4, $$3.c(), $$8, $$6, $$7);
      }
   }

   private void a(djk $$0, ebq $$1, iw $$2, flg $$3, fld.a $$4, gst $$5, gss.e $$6, int $$7) {
      int $$8 = $$5.c();
      float $$11;
      float $$12;
      float $$13;
      if ($$8 != -1) {
         int $$9;
         if ($$6.f == $$8) {
            $$9 = $$6.g;
         } else {
            $$9 = this.b.a($$1, $$0, $$2, $$8);
            $$6.f = $$8;
            $$6.g = $$9;
         }

         $$11 = ayh.j($$9);
         $$12 = ayh.k($$9);
         $$13 = ayh.l($$9);
      } else {
         $$11 = 1.0F;
         $$12 = 1.0F;
         $$13 = 1.0F;
      }

      $$3.a($$4, $$5, $$6.d, $$11, $$12, $$13, 1.0F, $$6.e, $$7, true);
   }

   private static void a(djk $$0, ebq $$1, iw $$2, int[] $$3, jc $$4, gss.e $$5) {
      float $$6 = 32.0F;
      float $$7 = 32.0F;
      float $$8 = 32.0F;
      float $$9 = -32.0F;
      float $$10 = -32.0F;
      float $$11 = -32.0F;

      for (int $$12 = 0; $$12 < 4; $$12++) {
         float $$13 = Float.intBitsToFloat($$3[$$12 * 8]);
         float $$14 = Float.intBitsToFloat($$3[$$12 * 8 + 1]);
         float $$15 = Float.intBitsToFloat($$3[$$12 * 8 + 2]);
         $$6 = Math.min($$6, $$13);
         $$7 = Math.min($$7, $$14);
         $$8 = Math.min($$8, $$15);
         $$9 = Math.max($$9, $$13);
         $$10 = Math.max($$10, $$14);
         $$11 = Math.max($$11, $$15);
      }

      if ($$5 instanceof gss.b $$16) {
         $$16.i[gss.f.e.n] = $$6;
         $$16.i[gss.f.f.n] = $$9;
         $$16.i[gss.f.a.n] = $$7;
         $$16.i[gss.f.b.n] = $$10;
         $$16.i[gss.f.c.n] = $$8;
         $$16.i[gss.f.d.n] = $$11;
         $$16.i[gss.f.k.n] = 1.0F - $$6;
         $$16.i[gss.f.l.n] = 1.0F - $$9;
         $$16.i[gss.f.g.n] = 1.0F - $$7;
         $$16.i[gss.f.h.n] = 1.0F - $$10;
         $$16.i[gss.f.i.n] = 1.0F - $$8;
         $$16.i[gss.f.j.n] = 1.0F - $$11;
      }

      float $$17 = 1.0E-4F;
      float $$18 = 0.9999F;

      $$5.c = switch ($$4) {
         case a, b -> $$6 >= 1.0E-4F || $$8 >= 1.0E-4F || $$9 <= 0.9999F || $$11 <= 0.9999F;
         case c, d -> $$6 >= 1.0E-4F || $$7 >= 1.0E-4F || $$9 <= 0.9999F || $$10 <= 0.9999F;
         case e, f -> $$7 >= 1.0E-4F || $$8 >= 1.0E-4F || $$10 <= 0.9999F || $$11 <= 0.9999F;
      };

      $$5.b = switch ($$4) {
         case a -> $$7 == $$10 && ($$7 < 1.0E-4F || $$1.m($$0, $$2));
         case b -> $$7 == $$10 && ($$10 > 0.9999F || $$1.m($$0, $$2));
         case c -> $$8 == $$11 && ($$8 < 1.0E-4F || $$1.m($$0, $$2));
         case d -> $$8 == $$11 && ($$11 > 0.9999F || $$1.m($$0, $$2));
         case e -> $$6 == $$9 && ($$6 < 1.0E-4F || $$1.m($$0, $$2));
         case f -> $$6 == $$9 && ($$9 > 0.9999F || $$1.m($$0, $$2));
      };
   }

   private void a(djk $$0, ebq $$1, iw $$2, int $$3, int $$4, boolean $$5, fld $$6, flg $$7, List<gst> $$8, gss.e $$9) {
      for (gst $$10 : $$8) {
         if ($$5) {
            a($$0, $$1, $$2, $$10.b(), $$10.d(), $$9);
            iw $$11 = (iw)($$9.b ? $$9.a.a($$2, $$10.d()) : $$2);
            $$3 = $$9.h.a($$1, $$0, $$11);
         }

         float $$12 = $$0.a($$10.d(), $$10.f());
         $$9.d[0] = $$12;
         $$9.d[1] = $$12;
         $$9.d[2] = $$12;
         $$9.d[3] = $$12;
         $$9.e[0] = $$3;
         $$9.e[1] = $$3;
         $$9.e[2] = $$3;
         $$9.e[3] = $$3;
         this.a($$0, $$1, $$2, $$7, $$6.c(), $$10, $$9, $$4);
      }
   }

   public static void a(fld.a $$0, flg $$1, gta $$2, float $$3, float $$4, float $$5, int $$6, int $$7) {
      for (gsz $$8 : $$2.a(bai.a(42L))) {
         for (jc $$9 : a) {
            a($$0, $$1, $$3, $$4, $$5, $$8.a($$9), $$6, $$7);
         }

         a($$0, $$1, $$3, $$4, $$5, $$8.a(null), $$6, $$7);
      }
   }

   private static void a(fld.a $$0, flg $$1, float $$2, float $$3, float $$4, List<gst> $$5, int $$6, int $$7) {
      for (gst $$8 : $$5) {
         float $$9;
         float $$10;
         float $$11;
         if ($$8.a()) {
            $$9 = azz.a($$2, 0.0F, 1.0F);
            $$10 = azz.a($$3, 0.0F, 1.0F);
            $$11 = azz.a($$4, 0.0F, 1.0F);
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
         }

         $$1.a($$0, $$8, $$9, $$10, $$11, 1.0F, $$6, $$7);
      }
   }

   public static void a() {
      d.get().a();
   }

   public static void b() {
      d.get().b();
   }

   protected static enum a {
      a(
         new jc[]{jc.e, jc.f, jc.c, jc.d},
         0.5F,
         true,
         new gss.f[]{gss.f.k, gss.f.d, gss.f.k, gss.f.j, gss.f.e, gss.f.j, gss.f.e, gss.f.d},
         new gss.f[]{gss.f.k, gss.f.c, gss.f.k, gss.f.i, gss.f.e, gss.f.i, gss.f.e, gss.f.c},
         new gss.f[]{gss.f.l, gss.f.c, gss.f.l, gss.f.i, gss.f.f, gss.f.i, gss.f.f, gss.f.c},
         new gss.f[]{gss.f.l, gss.f.d, gss.f.l, gss.f.j, gss.f.f, gss.f.j, gss.f.f, gss.f.d}
      ),
      b(
         new jc[]{jc.f, jc.e, jc.c, jc.d},
         1.0F,
         true,
         new gss.f[]{gss.f.f, gss.f.d, gss.f.f, gss.f.j, gss.f.l, gss.f.j, gss.f.l, gss.f.d},
         new gss.f[]{gss.f.f, gss.f.c, gss.f.f, gss.f.i, gss.f.l, gss.f.i, gss.f.l, gss.f.c},
         new gss.f[]{gss.f.e, gss.f.c, gss.f.e, gss.f.i, gss.f.k, gss.f.i, gss.f.k, gss.f.c},
         new gss.f[]{gss.f.e, gss.f.d, gss.f.e, gss.f.j, gss.f.k, gss.f.j, gss.f.k, gss.f.d}
      ),
      c(
         new jc[]{jc.b, jc.a, jc.f, jc.e},
         0.8F,
         true,
         new gss.f[]{gss.f.b, gss.f.k, gss.f.b, gss.f.e, gss.f.h, gss.f.e, gss.f.h, gss.f.k},
         new gss.f[]{gss.f.b, gss.f.l, gss.f.b, gss.f.f, gss.f.h, gss.f.f, gss.f.h, gss.f.l},
         new gss.f[]{gss.f.a, gss.f.l, gss.f.a, gss.f.f, gss.f.g, gss.f.f, gss.f.g, gss.f.l},
         new gss.f[]{gss.f.a, gss.f.k, gss.f.a, gss.f.e, gss.f.g, gss.f.e, gss.f.g, gss.f.k}
      ),
      d(
         new jc[]{jc.e, jc.f, jc.a, jc.b},
         0.8F,
         true,
         new gss.f[]{gss.f.b, gss.f.k, gss.f.h, gss.f.k, gss.f.h, gss.f.e, gss.f.b, gss.f.e},
         new gss.f[]{gss.f.a, gss.f.k, gss.f.g, gss.f.k, gss.f.g, gss.f.e, gss.f.a, gss.f.e},
         new gss.f[]{gss.f.a, gss.f.l, gss.f.g, gss.f.l, gss.f.g, gss.f.f, gss.f.a, gss.f.f},
         new gss.f[]{gss.f.b, gss.f.l, gss.f.h, gss.f.l, gss.f.h, gss.f.f, gss.f.b, gss.f.f}
      ),
      e(
         new jc[]{jc.b, jc.a, jc.c, jc.d},
         0.6F,
         true,
         new gss.f[]{gss.f.b, gss.f.d, gss.f.b, gss.f.j, gss.f.h, gss.f.j, gss.f.h, gss.f.d},
         new gss.f[]{gss.f.b, gss.f.c, gss.f.b, gss.f.i, gss.f.h, gss.f.i, gss.f.h, gss.f.c},
         new gss.f[]{gss.f.a, gss.f.c, gss.f.a, gss.f.i, gss.f.g, gss.f.i, gss.f.g, gss.f.c},
         new gss.f[]{gss.f.a, gss.f.d, gss.f.a, gss.f.j, gss.f.g, gss.f.j, gss.f.g, gss.f.d}
      ),
      f(
         new jc[]{jc.a, jc.b, jc.c, jc.d},
         0.6F,
         true,
         new gss.f[]{gss.f.g, gss.f.d, gss.f.g, gss.f.j, gss.f.a, gss.f.j, gss.f.a, gss.f.d},
         new gss.f[]{gss.f.g, gss.f.c, gss.f.g, gss.f.i, gss.f.a, gss.f.i, gss.f.a, gss.f.c},
         new gss.f[]{gss.f.h, gss.f.c, gss.f.h, gss.f.i, gss.f.b, gss.f.i, gss.f.b, gss.f.c},
         new gss.f[]{gss.f.h, gss.f.d, gss.f.h, gss.f.j, gss.f.b, gss.f.j, gss.f.b, gss.f.d}
      );

      final jc[] g;
      final boolean h;
      final gss.f[] i;
      final gss.f[] j;
      final gss.f[] k;
      final gss.f[] l;
      private static final gss.a[] m = ag.a(new gss.a[6], $$0 -> {
         $$0[jc.a.d()] = a;
         $$0[jc.b.d()] = b;
         $$0[jc.c.d()] = c;
         $$0[jc.d.d()] = d;
         $$0[jc.e.d()] = e;
         $$0[jc.f.d()] = f;
      });

      private a(final jc[] $$0, final float $$1, final boolean $$2, final gss.f[] $$3, final gss.f[] $$4, final gss.f[] $$5, final gss.f[] $$6) {
         this.g = $$0;
         this.h = $$2;
         this.i = $$3;
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
      }

      public static gss.a a(jc $$0) {
         return m[$$0.d()];
      }
   }

   static class b extends gss.e {
      final float[] i = new float[gss.f.m];

      public b() {
      }

      public void a(djk $$0, ebq $$1, iw $$2, jc $$3, boolean $$4) {
         iw $$5 = this.b ? $$2.a($$3) : $$2;
         gss.a $$6 = gss.a.a($$3);
         iw.a $$7 = this.a;
         $$7.a($$5, $$6.g[0]);
         ebq $$8 = $$0.a_($$7);
         int $$9 = this.h.a($$8, $$0, $$7);
         float $$10 = this.h.b($$8, $$0, $$7);
         $$7.a($$5, $$6.g[1]);
         ebq $$11 = $$0.a_($$7);
         int $$12 = this.h.a($$11, $$0, $$7);
         float $$13 = this.h.b($$11, $$0, $$7);
         $$7.a($$5, $$6.g[2]);
         ebq $$14 = $$0.a_($$7);
         int $$15 = this.h.a($$14, $$0, $$7);
         float $$16 = this.h.b($$14, $$0, $$7);
         $$7.a($$5, $$6.g[3]);
         ebq $$17 = $$0.a_($$7);
         int $$18 = this.h.a($$17, $$0, $$7);
         float $$19 = this.h.b($$17, $$0, $$7);
         ebq $$20 = $$0.a_($$7.a($$5, $$6.g[0]).c($$3));
         boolean $$21 = !$$20.k($$0, $$7) || $$20.g() == 0;
         ebq $$22 = $$0.a_($$7.a($$5, $$6.g[1]).c($$3));
         boolean $$23 = !$$22.k($$0, $$7) || $$22.g() == 0;
         ebq $$24 = $$0.a_($$7.a($$5, $$6.g[2]).c($$3));
         boolean $$25 = !$$24.k($$0, $$7) || $$24.g() == 0;
         ebq $$26 = $$0.a_($$7.a($$5, $$6.g[3]).c($$3));
         boolean $$27 = !$$26.k($$0, $$7) || $$26.g() == 0;
         float $$31;
         int $$32;
         if (!$$25 && !$$21) {
            $$31 = $$10;
            $$32 = $$9;
         } else {
            $$7.a($$5, $$6.g[0]).c($$6.g[2]);
            ebq $$28 = $$0.a_($$7);
            $$31 = this.h.b($$28, $$0, $$7);
            $$32 = this.h.a($$28, $$0, $$7);
         }

         float $$36;
         int $$37;
         if (!$$27 && !$$21) {
            $$36 = $$10;
            $$37 = $$9;
         } else {
            $$7.a($$5, $$6.g[0]).c($$6.g[3]);
            ebq $$33 = $$0.a_($$7);
            $$36 = this.h.b($$33, $$0, $$7);
            $$37 = this.h.a($$33, $$0, $$7);
         }

         float $$41;
         int $$42;
         if (!$$25 && !$$23) {
            $$41 = $$10;
            $$42 = $$9;
         } else {
            $$7.a($$5, $$6.g[1]).c($$6.g[2]);
            ebq $$38 = $$0.a_($$7);
            $$41 = this.h.b($$38, $$0, $$7);
            $$42 = this.h.a($$38, $$0, $$7);
         }

         float $$46;
         int $$47;
         if (!$$27 && !$$23) {
            $$46 = $$10;
            $$47 = $$9;
         } else {
            $$7.a($$5, $$6.g[1]).c($$6.g[3]);
            ebq $$43 = $$0.a_($$7);
            $$46 = this.h.b($$43, $$0, $$7);
            $$47 = this.h.a($$43, $$0, $$7);
         }

         int $$48 = this.h.a($$1, $$0, $$2);
         $$7.a($$2, $$3);
         ebq $$49 = $$0.a_($$7);
         if (this.b || !$$49.s()) {
            $$48 = this.h.a($$49, $$0, $$7);
         }

         float $$50 = this.b ? this.h.b($$0.a_($$5), $$0, $$5) : this.h.b($$0.a_($$2), $$0, $$2);
         gss.c $$51 = gss.c.a($$3);
         if (this.c && $$6.h) {
            float $$56 = ($$19 + $$10 + $$36 + $$50) * 0.25F;
            float $$57 = ($$16 + $$10 + $$31 + $$50) * 0.25F;
            float $$58 = ($$16 + $$13 + $$41 + $$50) * 0.25F;
            float $$59 = ($$19 + $$13 + $$46 + $$50) * 0.25F;
            float $$60 = this.i[$$6.i[0].n] * this.i[$$6.i[1].n];
            float $$61 = this.i[$$6.i[2].n] * this.i[$$6.i[3].n];
            float $$62 = this.i[$$6.i[4].n] * this.i[$$6.i[5].n];
            float $$63 = this.i[$$6.i[6].n] * this.i[$$6.i[7].n];
            float $$64 = this.i[$$6.j[0].n] * this.i[$$6.j[1].n];
            float $$65 = this.i[$$6.j[2].n] * this.i[$$6.j[3].n];
            float $$66 = this.i[$$6.j[4].n] * this.i[$$6.j[5].n];
            float $$67 = this.i[$$6.j[6].n] * this.i[$$6.j[7].n];
            float $$68 = this.i[$$6.k[0].n] * this.i[$$6.k[1].n];
            float $$69 = this.i[$$6.k[2].n] * this.i[$$6.k[3].n];
            float $$70 = this.i[$$6.k[4].n] * this.i[$$6.k[5].n];
            float $$71 = this.i[$$6.k[6].n] * this.i[$$6.k[7].n];
            float $$72 = this.i[$$6.l[0].n] * this.i[$$6.l[1].n];
            float $$73 = this.i[$$6.l[2].n] * this.i[$$6.l[3].n];
            float $$74 = this.i[$$6.l[4].n] * this.i[$$6.l[5].n];
            float $$75 = this.i[$$6.l[6].n] * this.i[$$6.l[7].n];
            this.d[$$51.g] = Math.clamp($$56 * $$60 + $$57 * $$61 + $$58 * $$62 + $$59 * $$63, 0.0F, 1.0F);
            this.d[$$51.h] = Math.clamp($$56 * $$64 + $$57 * $$65 + $$58 * $$66 + $$59 * $$67, 0.0F, 1.0F);
            this.d[$$51.i] = Math.clamp($$56 * $$68 + $$57 * $$69 + $$58 * $$70 + $$59 * $$71, 0.0F, 1.0F);
            this.d[$$51.j] = Math.clamp($$56 * $$72 + $$57 * $$73 + $$58 * $$74 + $$59 * $$75, 0.0F, 1.0F);
            int $$76 = a($$18, $$9, $$37, $$48);
            int $$77 = a($$15, $$9, $$32, $$48);
            int $$78 = a($$15, $$12, $$42, $$48);
            int $$79 = a($$18, $$12, $$47, $$48);
            this.e[$$51.g] = a($$76, $$77, $$78, $$79, $$60, $$61, $$62, $$63);
            this.e[$$51.h] = a($$76, $$77, $$78, $$79, $$64, $$65, $$66, $$67);
            this.e[$$51.i] = a($$76, $$77, $$78, $$79, $$68, $$69, $$70, $$71);
            this.e[$$51.j] = a($$76, $$77, $$78, $$79, $$72, $$73, $$74, $$75);
         } else {
            float $$52 = ($$19 + $$10 + $$36 + $$50) * 0.25F;
            float $$53 = ($$16 + $$10 + $$31 + $$50) * 0.25F;
            float $$54 = ($$16 + $$13 + $$41 + $$50) * 0.25F;
            float $$55 = ($$19 + $$13 + $$46 + $$50) * 0.25F;
            this.e[$$51.g] = a($$18, $$9, $$37, $$48);
            this.e[$$51.h] = a($$15, $$9, $$32, $$48);
            this.e[$$51.i] = a($$15, $$12, $$42, $$48);
            this.e[$$51.j] = a($$18, $$12, $$47, $$48);
            this.d[$$51.g] = $$52;
            this.d[$$51.h] = $$53;
            this.d[$$51.i] = $$54;
            this.d[$$51.j] = $$55;
         }

         float $$80 = $$0.a($$3, $$4);

         for (int $$81 = 0; $$81 < this.d.length; $$81++) {
            this.d[$$81] = this.d[$$81] * $$80;
         }
      }

      private static int a(int $$0, int $$1, int $$2, int $$3) {
         if ($$0 == 0) {
            $$0 = $$3;
         }

         if ($$1 == 0) {
            $$1 = $$3;
         }

         if ($$2 == 0) {
            $$2 = $$3;
         }

         return $$0 + $$1 + $$2 + $$3 >> 2 & 16711935;
      }

      private static int a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         int $$8 = (int)((float)($$0 >> 16 & 0xFF) * $$4 + (float)($$1 >> 16 & 0xFF) * $$5 + (float)($$2 >> 16 & 0xFF) * $$6 + (float)($$3 >> 16 & 0xFF) * $$7)
            & 0xFF;
         int $$9 = (int)((float)($$0 & 0xFF) * $$4 + (float)($$1 & 0xFF) * $$5 + (float)($$2 & 0xFF) * $$6 + (float)($$3 & 0xFF) * $$7) & 0xFF;
         return $$8 << 16 | $$9;
      }
   }

   static enum c {
      a(0, 1, 2, 3),
      b(2, 3, 0, 1),
      c(3, 0, 1, 2),
      d(0, 1, 2, 3),
      e(3, 0, 1, 2),
      f(1, 2, 3, 0);

      final int g;
      final int h;
      final int i;
      final int j;
      private static final gss.c[] k = ag.a(new gss.c[6], $$0 -> {
         $$0[jc.a.d()] = a;
         $$0[jc.b.d()] = b;
         $$0[jc.c.d()] = c;
         $$0[jc.d.d()] = d;
         $$0[jc.e.d()] = e;
         $$0[jc.f.d()] = f;
      });

      private c(final int $$0, final int $$1, final int $$2, final int $$3) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         this.j = $$3;
      }

      public static gss.c a(jc $$0) {
         return k[$$0.d()];
      }
   }

   static class d {
      private boolean a;
      private final Long2IntLinkedOpenHashMap b = ag.a(() -> {
         Long2IntLinkedOpenHashMap $$0 = new Long2IntLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Integer.MAX_VALUE);
         return $$0;
      });
      private final Long2FloatLinkedOpenHashMap c = ag.a(() -> {
         Long2FloatLinkedOpenHashMap $$0 = new Long2FloatLinkedOpenHashMap(100, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0.defaultReturnValue(Float.NaN);
         return $$0;
      });

      private d() {
      }

      public void a() {
         this.a = true;
      }

      public void b() {
         this.a = false;
         this.b.clear();
         this.c.clear();
      }

      public int a(ebq $$0, djk $$1, iw $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            int $$4 = this.b.get($$3);
            if ($$4 != Integer.MAX_VALUE) {
               return $$4;
            }
         }

         int $$5 = gri.a($$1, $$0, $$2);
         if (this.a) {
            if (this.b.size() == 100) {
               this.b.removeFirstInt();
            }

            this.b.put($$3, $$5);
         }

         return $$5;
      }

      public float b(ebq $$0, djk $$1, iw $$2) {
         long $$3 = $$2.a();
         if (this.a) {
            float $$4 = this.c.get($$3);
            if (!Float.isNaN($$4)) {
               return $$4;
            }
         }

         float $$5 = $$0.c($$1, $$2);
         if (this.a) {
            if (this.c.size() == 100) {
               this.c.removeFirstFloat();
            }

            this.c.put($$3, $$5);
         }

         return $$5;
      }
   }

   static class e {
      public final iw.a a = new iw.a();
      public boolean b;
      public boolean c;
      public final float[] d = new float[4];
      public final int[] e = new int[4];
      public int f = -1;
      public int g;
      public final gss.d h = gss.d.get();
   }

   protected static enum f {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6),
      h(7),
      i(8),
      j(9),
      k(10),
      l(11);

      public static final int m = values().length;
      final int n;

      private f(final int $$0) {
         this.n = $$0;
      }
   }
}
