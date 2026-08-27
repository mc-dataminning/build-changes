import java.util.Optional;
import java.util.function.Consumer;

public class lu implements ls {
   @Override
   public void a(jc.a $$0, Consumer<ag> $$1) {
      ag $$2 = b("root").a(cuk.vT.v(), am.a, false, false, false).b("joined_world", db.a.a(Optional.empty())).a($$1);
      b("get_peeled").b($$2).a(((cuc)cuk.AD.get(csy.a)).v(), am.a, true, true, false).b("get_peeled", db.a.c()).a($$1);
      ag $$3 = b("enter_the_potato").b($$2).a(cuk.As.v(), am.a, true, true, true).b("entered_potato", az.a.a(dca.k)).a($$1);
      ly.a(b("all_potatoed"), $$0, ddn.a.b.a().toList()).b($$3).a(cuk.aM.v(), am.b, true, true, false).a($$1);
      b("eat_armor").b($$2).a(cuk.rq.v(), am.a, true, true, true).b("eat_armor", db.a.d()).a($$1);
      ag $$4 = b("rumbled").b($$2).a(cuk.AH.v(), am.a, false, true, false).b("rumble_plant", db.a.h()).a($$1);
      b("good_plant").b($$4).a(cuk.Ax.v(), am.a, true, true, false).b("compost_staff", db.a.i()).a($$1);
      ag $$5 = b("get_oily").b($$2).a(cuk.vQ.v(), am.a, true, false, false).b("refine_potato_oil", dd.d.a(cuk.vQ)).a($$1);
      ag $$6 = b("lubricate").b($$5).a(cuk.vQ.v(), am.a, true, false, false).b("lubricate_item", dd.d.a(1)).a($$1);
      b("mega_lubricate").b($$5).a(cuk.vQ.v().K(), am.a, true, false, true).b("mega_lubricate_item", dd.d.a(10)).a($$1);
      ag $$7 = b("lubricate_whee").b($$6).a(cuk.gf.v(), am.a, true, true, true).b("throw_lubricated_item", dt.a.a(1)).a($$1);
      b("mega_lubricate_whee").b($$7).a(cuk.gf.v().K(), am.a, true, true, true).b("throw_mega_lubricated_item", dt.a.a(10)).a($$1);
      b("lubricate_boots").b($$6).a(cuk.rp.v(), am.a, true, true, true).b("lubricate_boots", dd.d.a(ci.a.a().a(awm.bi).b(), 1)).a($$1);
      b("sweet_potato_talker").b($$2).a(cuk.eD.v(), am.a, true, true, false).b("said_potato", db.a.a(99)).a($$1);
      b("craft_poisonous_potato_sticks").b($$2).a(cuk.vM.v(), am.a, true, false, false).b("poisonous_potato_sticks", cc.a.a(cuk.vM)).a($$1);
      b("craft_poisonous_potato_slices").b($$2).a(cuk.vN.v(), am.a, true, false, false).b("poisonous_potato_slices", cc.a.a(cuk.vN)).a($$1);
      b("craft_poisonous_potato_fries").b($$2).a(cuk.vL.v(), am.a, true, false, false).b("poisonous_potato_fries", cc.a.a(cuk.vL)).a($$1);
      b("craft_poisonous_potato_chips").b($$2).a(cuk.vO.v(), am.a, true, false, false).b("poisonous_potato_chips", cc.a.a(cuk.vO)).a($$1);
      ag $$8 = b("poisonous_potato_taster")
         .b($$2)
         .a(cuk.vM.v(), am.a, true, true, false)
         .b("ate_poisonous_potato_sticks", bc.a.a(cuk.vM))
         .b("ate_poisonous_potato_slices", bc.a.a(cuk.vN))
         .a($$1);
      b("poisonous_potato_gourmet")
         .b($$8)
         .a(cuk.vO.v(), am.a, true, true, false)
         .b("ate_poisonous_potato_sticks", bc.a.a(cuk.vM))
         .b("ate_poisonous_potato_slices", bc.a.a(cuk.vN))
         .b("ate_poisonous_potato_fries", bc.a.a(cuk.vL))
         .b("ate_poisonous_potato_chips", bc.a.a(cuk.vO))
         .a($$1);
      b("bring_home_the_corruption").b($$3).a(cuk.E.v(), am.a, true, true, true).b("bring_home_the_corruption", db.a.j()).a($$1);
      ag $$9 = b("potato_peeler").b($$2).a(cuk.AA.v(), am.a, true, false, false).b("potato_peeler", cc.a.a(cuk.AA)).a($$1);
      b("peel_all_the_things")
         .b($$9)
         .a(cuk.AA.v(), am.b, true, true, true)
         .b("peel_block", a(an.an))
         .b("peel_sheep", a(an.ao))
         .b("peel_armor", a(an.ap))
         .a($$1);
      b("well_done").b($$2).a(cuk.pN.v(), am.a, true, true, false).b("well_done", de.a.a(new akt("overcooked_potatoes"))).a($$1);
   }

   private static lu.a b(String $$0) {
      return new lu.a($$0).d();
   }

   private static ao<db.a> a(db $$0) {
      return $$0.a(new db.a(Optional.empty()));
   }

   static class a extends af.a {
      private static final akt a = new akt("textures/gui/advancements/backgrounds/potato.png");
      private final String b;

      a(String $$0) {
         this.b = $$0;
      }

      public lu.a d() {
         return (lu.a)super.c();
      }

      public lu.a a(cuh $$0, am $$1, boolean $$2, boolean $$3, boolean $$4) {
         return (lu.a)this.a(
            $$0, xe.c("advancements.potato." + this.b + ".title"), xe.c("advancements.potato." + this.b + ".description"), a, $$1, $$2, $$3, $$4
         );
      }

      public lu.a b(ag $$0) {
         return (lu.a)super.a($$0);
      }

      public lu.a b(ak.a $$0) {
         return (lu.a)super.a($$0);
      }

      public lu.a b(ak $$0) {
         return (lu.a)super.a($$0);
      }

      public lu.a b(String $$0, ao<?> $$1) {
         return (lu.a)super.a($$0, $$1);
      }

      public lu.a b(aj.a $$0) {
         return (lu.a)super.a($$0);
      }

      public lu.a b(aj $$0) {
         return (lu.a)super.a($$0);
      }

      public ag a(Consumer<ag> $$0) {
         return this.a($$0, "potato/" + this.b);
      }
   }
}
