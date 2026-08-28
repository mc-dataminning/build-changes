import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;

public enum h implements bam {
   a("identity", j.a, false, false, false),
   b("rot_180_face_xy", j.a, true, true, false),
   c("rot_180_face_xz", j.a, true, false, true),
   d("rot_180_face_yz", j.a, false, true, true),
   e("rot_120_nnn", j.d, false, false, false),
   f("rot_120_nnp", j.e, true, false, true),
   g("rot_120_npn", j.e, false, true, true),
   h("rot_120_npp", j.d, true, false, true),
   i("rot_120_pnn", j.e, true, true, false),
   j("rot_120_pnp", j.d, true, true, false),
   k("rot_120_ppn", j.d, false, true, true),
   l("rot_120_ppp", j.e, false, false, false),
   m("rot_180_edge_xy_neg", j.b, true, true, true),
   n("rot_180_edge_xy_pos", j.b, false, false, true),
   o("rot_180_edge_xz_neg", j.f, true, true, true),
   p("rot_180_edge_xz_pos", j.f, false, true, false),
   q("rot_180_edge_yz_neg", j.c, true, true, true),
   r("rot_180_edge_yz_pos", j.c, true, false, false),
   s("rot_90_x_neg", j.c, false, false, true),
   t("rot_90_x_pos", j.c, false, true, false),
   u("rot_90_y_neg", j.f, true, false, false),
   v("rot_90_y_pos", j.f, false, false, true),
   w("rot_90_z_neg", j.b, false, true, false),
   x("rot_90_z_pos", j.b, true, false, false),
   y("inversion", j.a, true, true, true),
   z("invert_x", j.a, true, false, false),
   A("invert_y", j.a, false, true, false),
   B("invert_z", j.a, false, false, true),
   C("rot_60_ref_nnn", j.e, true, true, true),
   D("rot_60_ref_nnp", j.d, true, false, false),
   E("rot_60_ref_npn", j.d, false, false, true),
   F("rot_60_ref_npp", j.e, false, false, true),
   G("rot_60_ref_pnn", j.d, false, true, false),
   H("rot_60_ref_pnp", j.e, true, false, false),
   I("rot_60_ref_ppn", j.e, false, true, false),
   J("rot_60_ref_ppp", j.d, true, true, true),
   K("swap_xy", j.b, false, false, false),
   L("swap_yz", j.c, false, false, false),
   M("swap_xz", j.f, false, false, false),
   N("swap_neg_xy", j.b, true, true, false),
   O("swap_neg_yz", j.c, false, true, true),
   P("swap_neg_xz", j.f, true, false, true),
   Q("rot_90_ref_x_neg", j.c, true, false, true),
   R("rot_90_ref_x_pos", j.c, true, true, false),
   S("rot_90_ref_y_neg", j.f, true, true, false),
   T("rot_90_ref_y_pos", j.f, false, true, true),
   U("rot_90_ref_z_neg", j.b, false, true, true),
   V("rot_90_ref_z_pos", j.b, true, false, true);

   private static final jb.a[] X = jb.a.values();
   private final Matrix3fc Y;
   private final String Z;
   @Nullable
   private Map<jb, jb> aa;
   private final boolean ab;
   private final boolean ac;
   private final boolean ad;
   private final j ae;
   private static final h[][] af = ag.a(new h[values().length][values().length], $$0 -> {
      Map<Pair<j, BooleanList>, h> $$1 = Arrays.stream(values()).collect(Collectors.toMap($$0x -> Pair.of($$0x.ae, $$0x.d()), $$0x -> $$0x));

      for (h $$2 : values()) {
         for (h $$3 : values()) {
            BooleanList $$4 = $$2.d();
            BooleanList $$5 = $$3.d();
            j $$6 = $$3.ae.a($$2.ae);
            BooleanArrayList $$7 = new BooleanArrayList(3);

            for (int $$8 = 0; $$8 < 3; $$8++) {
               $$7.add($$4.getBoolean($$8) ^ $$5.getBoolean($$2.ae.a($$8)));
            }

            $$0[$$2.ordinal()][$$3.ordinal()] = $$1.get(Pair.of($$6, $$7));
         }
      }
   });
   private static final h[] ag = Arrays.stream(values()).map($$0 -> Arrays.stream(values()).filter($$1 -> $$0.a($$1) == a).findAny().get()).toArray(h[]::new);
   private static final h[][] ah = ag.a(new h[i.values().length][i.values().length], $$0 -> {
      for (i $$1 : i.values()) {
         for (i $$2 : i.values()) {
            h $$3 = a;

            for (int $$4 = 0; $$4 < $$2.f; $$4++) {
               $$3 = $$3.a(u);
            }

            for (int $$5 = 0; $$5 < $$1.f; $$5++) {
               $$3 = $$3.a(s);
            }

            $$0[$$1.ordinal()][$$2.ordinal()] = $$3;
         }
      }
   });

   private h(final String $$0, final j $$1, final boolean $$2, final boolean $$3, final boolean $$4) {
      this.Z = $$0;
      this.ab = $$2;
      this.ac = $$3;
      this.ad = $$4;
      this.ae = $$1;
      Matrix3f $$5 = new Matrix3f().scaling($$2 ? -1.0F : 1.0F, $$3 ? -1.0F : 1.0F, $$4 ? -1.0F : 1.0F);
      $$5.mul($$1.a());
      this.Y = $$5;
   }

   private BooleanList d() {
      return new BooleanArrayList(new boolean[]{this.ab, this.ac, this.ad});
   }

   public h a(h $$0) {
      return af[this.ordinal()][$$0.ordinal()];
   }

   public h a() {
      return ag[this.ordinal()];
   }

   public Matrix3fc b() {
      return this.Y;
   }

   @Override
   public String toString() {
      return this.Z;
   }

   @Override
   public String c() {
      return this.Z;
   }

   public jb a(jb $$0) {
      if (this.aa == null) {
         this.aa = ag.a(jb.class, $$0x -> {
            jb.a $$1 = $$0x.o();
            jb.b $$2 = $$0x.f();
            jb.a $$3 = this.b($$1);
            jb.b $$4 = this.a($$3) ? $$2.c() : $$2;
            return jb.a($$3, $$4);
         });
      }

      return this.aa.get($$0);
   }

   public boolean a(jb.a $$0) {
      return switch ($$0) {
         case a -> this.ab;
         case b -> this.ac;
         case c -> this.ad;
      };
   }

   public jb.a b(jb.a $$0) {
      return X[this.ae.a($$0.ordinal())];
   }

   public jd a(jd $$0) {
      return jd.a(this.a($$0.a()), this.a($$0.b()));
   }

   public static h a(i $$0, i $$1) {
      return ah[$$0.ordinal()][$$1.ordinal()];
   }
}
