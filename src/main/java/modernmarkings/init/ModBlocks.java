package modernmarkings.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import modernmarkings.blocks.MarkingFlag;
import modernmarkings.blocks.MarkingFloor;
import modernmarkings.blocks.MarkingWallGeneral;

public class ModBlocks {

    /**
     * Storing all Mod Blocks in an Array List
     */
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Block> FLOOR_BLOCKS = new ArrayList<>();
    public static final List<Block> WALL_BLOCKS_GENERAL = new ArrayList<>();
    public static final List<Block> WALL_BLOCKS_FLAG = new ArrayList<>();

    // spotless:off
    public static final Block FLOOR_MARKING_EXIT = new MarkingFloor("floor_marking_exit", "marking_exit");
    public static final Block FLOOR_MARKING_BLACK_SINGLELINE = new MarkingFloor("floor_marking_black_singleline", "marking_black_singleline");
    public static final Block FLOOR_MARKING_BLUE_SINGLELINE = new MarkingFloor("floor_marking_blue_singleline", "marking_blue_singleline");
    public static final Block FLOOR_MARKING_DANGER_RED = new MarkingFloor("floor_marking_danger_red", "marking_danger_red");
    public static final Block FLOOR_MARKING_DANGER_YELLOW = new MarkingFloor("floor_marking_danger_yellow", "marking_danger_yellow");
    public static final Block FLOOR_MARKING_GREEN_SINGLELINE = new MarkingFloor("floor_marking_green_singleline", "marking_green_singleline");
    public static final Block FLOOR_MARKING_NOENTRY = new MarkingFloor("floor_marking_noentry", "marking_noentry");
    public static final Block FLOOR_MARKING_NOSTEP = new MarkingFloor("floor_marking_nostep", "marking_nostep");
    public static final Block FLOOR_MARKING_ORANGE_SINGLELINE = new MarkingFloor("floor_marking_orange_singleline", "marking_orange_singleline");
    public static final Block FLOOR_MARKING_RED_HAZARDLINE = new MarkingFloor("floor_marking_red_hazardline", "marking_red_hazardline");
    public static final Block FLOOR_MARKING_RED_SINGLELINE = new MarkingFloor("floor_marking_red_singleline", "marking_red_singleline");
    public static final Block FLOOR_MARKING_REDX = new MarkingFloor("floor_marking_redx", "marking_redx");
    public static final Block FLOOR_MARKING_WHITE_ARROW = new MarkingFloor("floor_marking_white_arrow", "marking_white_arrow");
    public static final Block FLOOR_MARKING_WHITE_LANE = new MarkingFloor("floor_marking_white_lane", "marking_white_lane");
    public static final Block FLOOR_MARKING_WHITE_LANE_CROSS = new MarkingFloor("floor_marking_white_lane_cross", "marking_white_lane_cross");
    public static final Block FLOOR_MARKING_WHITE_SINGLELINE = new MarkingFloor("floor_marking_white_singleline", "marking_white_singleline");
    public static final Block FLOOR_MARKING_WHITE_SQUARE = new MarkingFloor("floor_marking_white_square", "marking_white_square");
    public static final Block FLOOR_MARKING_WHITEBLACK_HAZARDLINE = new MarkingFloor("floor_marking_whiteblack_hazardline", "marking_whiteblack_hazardline");
    public static final Block FLOOR_MARKING_YELLOW_ARROW = new MarkingFloor("floor_marking_yellow_arrow", "marking_yellow_arrow");
    public static final Block FLOOR_MARKING_YELLOW_HAZARDLINE = new MarkingFloor("floor_marking_yellow_hazardline", "marking_yellow_hazardline");
    public static final Block FLOOR_MARKING_YELLOW_LANE = new MarkingFloor("floor_marking_yellow_lane", "marking_yellow_lane");
    public static final Block FLOOR_MARKING_YELLOW_SIDELINE = new MarkingFloor("floor_marking_yellow_sideline", "marking_yellow_sideline");
    public static final Block FLOOR_MARKING_YELLOW_SINGLELINE = new MarkingFloor("floor_marking_yellow_singleline", "marking_yellow_singleline");
    public static final Block FLOOR_MARKING_YELLOW_SQUARE = new MarkingFloor("floor_marking_yellow_square", "marking_yellow_square");
    public static final Block FLOOR_MARKING_YELLOW_STRIPES = new MarkingFloor("floor_marking_yellow_stripes", "marking_yellow_stripes");

    public static final Block FLOOR_MARKING_LETTER_A = new MarkingFloor("floor_marking_letter_a", "marking_letter_a");
    public static final Block FLOOR_MARKING_LETTER_B = new MarkingFloor("floor_marking_letter_b", "marking_letter_b");
    public static final Block FLOOR_MARKING_LETTER_C = new MarkingFloor("floor_marking_letter_c", "marking_letter_c");
    public static final Block FLOOR_MARKING_LETTER_D = new MarkingFloor("floor_marking_letter_d", "marking_letter_d");
    public static final Block FLOOR_MARKING_LETTER_E = new MarkingFloor("floor_marking_letter_e", "marking_letter_e");
    public static final Block FLOOR_MARKING_LETTER_F = new MarkingFloor("floor_marking_letter_f", "marking_letter_f");
    public static final Block FLOOR_MARKING_LETTER_G = new MarkingFloor("floor_marking_letter_g", "marking_letter_g");
    public static final Block FLOOR_MARKING_LETTER_H = new MarkingFloor("floor_marking_letter_h", "marking_letter_h");
    public static final Block FLOOR_MARKING_LETTER_I = new MarkingFloor("floor_marking_letter_i", "marking_letter_i");
    public static final Block FLOOR_MARKING_LETTER_J = new MarkingFloor("floor_marking_letter_j", "marking_letter_j");
    public static final Block FLOOR_MARKING_LETTER_K = new MarkingFloor("floor_marking_letter_k", "marking_letter_k");
    public static final Block FLOOR_MARKING_LETTER_L = new MarkingFloor("floor_marking_letter_l", "marking_letter_l");
    public static final Block FLOOR_MARKING_LETTER_M = new MarkingFloor("floor_marking_letter_m", "marking_letter_m");
    public static final Block FLOOR_MARKING_LETTER_N = new MarkingFloor("floor_marking_letter_n", "marking_letter_n");
    public static final Block FLOOR_MARKING_LETTER_O = new MarkingFloor("floor_marking_letter_o", "marking_letter_o");
    public static final Block FLOOR_MARKING_LETTER_P = new MarkingFloor("floor_marking_letter_p", "marking_letter_p");
    public static final Block FLOOR_MARKING_LETTER_Q = new MarkingFloor("floor_marking_letter_q", "marking_letter_q");
    public static final Block FLOOR_MARKING_LETTER_R = new MarkingFloor("floor_marking_letter_r", "marking_letter_r");
    public static final Block FLOOR_MARKING_LETTER_S = new MarkingFloor("floor_marking_letter_s", "marking_letter_s");
    public static final Block FLOOR_MARKING_LETTER_T = new MarkingFloor("floor_marking_letter_t", "marking_letter_t");
    public static final Block FLOOR_MARKING_LETTER_U = new MarkingFloor("floor_marking_letter_u", "marking_letter_u");
    public static final Block FLOOR_MARKING_LETTER_V = new MarkingFloor("floor_marking_letter_v", "marking_letter_v");
    public static final Block FLOOR_MARKING_LETTER_W = new MarkingFloor("floor_marking_letter_w", "marking_letter_w");
    public static final Block FLOOR_MARKING_LETTER_X = new MarkingFloor("floor_marking_letter_x", "marking_letter_x");
    public static final Block FLOOR_MARKING_LETTER_Y = new MarkingFloor("floor_marking_letter_y", "marking_letter_y");
    public static final Block FLOOR_MARKING_LETTER_Z = new MarkingFloor("floor_marking_letter_z", "marking_letter_z");

    public static final Block WALL_MARKING_EXIT = new MarkingWallGeneral("wall_marking_exit", "marking_wall_exit");
    public static final Block WALL_MARKING_NUMBER_0 = new MarkingWallGeneral("wall_marking_number_0", "marking_number_0");
    public static final Block WALL_MARKING_NUMBER_1 = new MarkingWallGeneral("wall_marking_number_1", "marking_number_1");
    public static final Block WALL_MARKING_NUMBER_2 = new MarkingWallGeneral("wall_marking_number_2", "marking_number_2");
    public static final Block WALL_MARKING_NUMBER_3 = new MarkingWallGeneral("wall_marking_number_3", "marking_number_3");
    public static final Block WALL_MARKING_NUMBER_4 = new MarkingWallGeneral("wall_marking_number_4", "marking_number_4");
    public static final Block WALL_MARKING_NUMBER_5 = new MarkingWallGeneral("wall_marking_number_5", "marking_number_5");
    public static final Block WALL_MARKING_NUMBER_6 = new MarkingWallGeneral("wall_marking_number_6", "marking_number_6");
    public static final Block WALL_MARKING_NUMBER_7 = new MarkingWallGeneral("wall_marking_number_7", "marking_number_7");
    public static final Block WALL_MARKING_NUMBER_8 = new MarkingWallGeneral("wall_marking_number_8", "marking_number_8");
    public static final Block WALL_MARKING_NUMBER_9 = new MarkingWallGeneral("wall_marking_number_9", "marking_number_9");
    public static final Block WALL_MARKING_NUMBER_NO = new MarkingWallGeneral("wall_marking_number_no", "marking_number_no");
    public static final Block WALL_MARKING_NUMBER_NUMERO = new MarkingWallGeneral("wall_marking_number_numero", "marking_number_numero");
    public static final Block WALL_MARKING_NUMBER_DASH = new MarkingWallGeneral("wall_marking_number_dash", "marking_number_dash");
    public static final Block WALL_MARKING_NUMBER_COMMA = new MarkingWallGeneral("wall_marking_number_comma", "marking_number_comma");
    public static final Block WALL_MARKING_NUMBER_PERIOD = new MarkingWallGeneral("wall_marking_number_period", "marking_number_period");
    public static final Block WALL_MARKING_SYMBOL_CHEMICAL = new MarkingWallGeneral("wall_marking_symbol_chemical", "marking_wall_symbol_chemical");
    public static final Block WALL_MARKING_SYMBOL_ELECTRIC = new MarkingWallGeneral("wall_marking_symbol_electric", "marking_wall_symbol_electric");
    public static final Block WALL_MARKING_SYMBOL_FIRE = new MarkingWallGeneral("wall_marking_symbol_fire", "marking_wall_symbol_fire");
    public static final Block WALL_MARKING_SYMBOL_FLUID = new MarkingWallGeneral("wall_marking_symbol_fluid", "marking_wall_symbol_fluid");
    public static final Block WALL_MARKING_SYMBOL_FROST = new MarkingWallGeneral("wall_marking_symbol_frost", "marking_wall_symbol_frost");
    public static final Block WALL_MARKING_SYMBOL_GEARS = new MarkingWallGeneral("wall_marking_symbol_gears", "marking_wall_symbol_gears");
    public static final Block WALL_MARKING_SYMBOL_LASER = new MarkingWallGeneral("wall_marking_symbol_laser", "marking_wall_symbol_laser");
    public static final Block WALL_MARKING_SYMBOL_MAGIC = new MarkingWallGeneral("wall_marking_symbol_magic", "marking_wall_symbol_magic");
    public static final Block WALL_MARKING_SYMBOL_MOB = new MarkingWallGeneral("wall_marking_symbol_mob", "marking_wall_symbol_mob");
    public static final Block WALL_MARKING_SYMBOL_PINCH = new MarkingWallGeneral("wall_marking_symbol_pinch", "marking_wall_symbol_pinch");
    public static final Block WALL_MARKING_SYMBOL_PRODUCTION = new MarkingWallGeneral("wall_marking_symbol_production", "marking_wall_symbol_production");
    public static final Block WALL_MARKING_SYMBOL_RADIATION = new MarkingWallGeneral("wall_marking_symbol_radiation", "marking_wall_symbol_radiation");
    public static final Block WALL_MARKING_SYMBOL_STORAGE = new MarkingWallGeneral("wall_marking_symbol_storage", "marking_wall_symbol_storage");
    public static final Block WALL_MARKING_WARNING_DANGER = new MarkingWallGeneral("wall_marking_warning_danger", "marking_wall_warning_danger");
    public static final Block WALL_MARKING_ARROWLEFT = new MarkingWallGeneral("wall_marking_arrowleft", "marking_wall_arrowleft");
    public static final Block WALL_MARKING_ARROWRIGHT = new MarkingWallGeneral("wall_marking_arrowright", "marking_wall_arrowright");
    public static final Block WALL_MARKING_HAZARDLINE_LEFT = new MarkingWallGeneral("wall_marking_hazardline_left", "marking_wall_hazardline_left");
    public static final Block WALL_MARKING_HAZARDLINE_RIGHT = new MarkingWallGeneral("wall_marking_hazardline_right", "marking_wall_hazardline_right");
    public static final Block WALL_MARKING_HAZARD_DIAMOND = new MarkingWallGeneral("wall_marking_hazard_diamond", "marking_wall_hazard_diamond");

    public static final Block WALL_MARKING_VOLTAGE_EU = new MarkingWallGeneral("wall_marking_voltage_eu", "marking_wall_voltage_eu");
    public static final Block WALL_MARKING_VOLTAGE_EV = new MarkingWallGeneral("wall_marking_voltage_ev", "marking_wall_voltage_ev");
    public static final Block WALL_MARKING_VOLTAGE_FE = new MarkingWallGeneral("wall_marking_voltage_fe", "marking_wall_voltage_fe");
    public static final Block WALL_MARKING_VOLTAGE_HV = new MarkingWallGeneral("wall_marking_voltage_hv", "marking_wall_voltage_hv");
    public static final Block WALL_MARKING_VOLTAGE_IV = new MarkingWallGeneral("wall_marking_voltage_iv", "marking_wall_voltage_iv");
    public static final Block WALL_MARKING_VOLTAGE_LUV = new MarkingWallGeneral("wall_marking_voltage_luv", "marking_wall_voltage_luv");
    public static final Block WALL_MARKING_VOLTAGE_LV = new MarkingWallGeneral("wall_marking_voltage_lv", "marking_wall_voltage_lv");
    public static final Block WALL_MARKING_VOLTAGE_MAX = new MarkingWallGeneral("wall_marking_voltage_max", "marking_wall_voltage_max");
    public static final Block WALL_MARKING_VOLTAGE_MV = new MarkingWallGeneral("wall_marking_voltage_mv", "marking_wall_voltage_mv");
    public static final Block WALL_MARKING_VOLTAGE_PERT = new MarkingWallGeneral("wall_marking_voltage_pert", "marking_wall_voltage_pert");
    public static final Block WALL_MARKING_VOLTAGE_RF = new MarkingWallGeneral("wall_marking_voltage_rf", "marking_wall_voltage_rf");
    public static final Block WALL_MARKING_VOLTAGE_UEV = new MarkingWallGeneral("wall_marking_voltage_uev", "marking_wall_voltage_uev");
    public static final Block WALL_MARKING_VOLTAGE_UHV = new MarkingWallGeneral("wall_marking_voltage_uhv", "marking_wall_voltage_uhv");
    public static final Block WALL_MARKING_VOLTAGE_UIV = new MarkingWallGeneral("wall_marking_voltage_uiv", "marking_wall_voltage_uiv");
    public static final Block WALL_MARKING_VOLTAGE_UMV = new MarkingWallGeneral("wall_marking_voltage_umv", "marking_wall_voltage_umv");
    public static final Block WALL_MARKING_VOLTAGE_UV = new MarkingWallGeneral("wall_marking_voltage_uv", "marking_wall_voltage_uv");
    public static final Block WALL_MARKING_VOLTAGE_UXV = new MarkingWallGeneral("wall_marking_voltage_uxv", "marking_wall_voltage_uxv");
    public static final Block WALL_MARKING_VOLTAGE_ZPM = new MarkingWallGeneral("wall_marking_voltage_zpm", "marking_wall_voltage_zpm");

    public static final Block WALL_MARKING_LETTER_A = new MarkingWallGeneral("wall_marking_letter_a", "marking_letter_a");
    public static final Block WALL_MARKING_LETTER_B = new MarkingWallGeneral("wall_marking_letter_b", "marking_letter_b");
    public static final Block WALL_MARKING_LETTER_C = new MarkingWallGeneral("wall_marking_letter_c", "marking_letter_c");
    public static final Block WALL_MARKING_LETTER_D = new MarkingWallGeneral("wall_marking_letter_d", "marking_letter_d");
    public static final Block WALL_MARKING_LETTER_E = new MarkingWallGeneral("wall_marking_letter_e", "marking_letter_e");
    public static final Block WALL_MARKING_LETTER_F = new MarkingWallGeneral("wall_marking_letter_f", "marking_letter_f");
    public static final Block WALL_MARKING_LETTER_G = new MarkingWallGeneral("wall_marking_letter_g", "marking_letter_g");
    public static final Block WALL_MARKING_LETTER_H = new MarkingWallGeneral("wall_marking_letter_h", "marking_letter_h");
    public static final Block WALL_MARKING_LETTER_I = new MarkingWallGeneral("wall_marking_letter_i", "marking_letter_i");
    public static final Block WALL_MARKING_LETTER_J = new MarkingWallGeneral("wall_marking_letter_j", "marking_letter_j");
    public static final Block WALL_MARKING_LETTER_K = new MarkingWallGeneral("wall_marking_letter_k", "marking_letter_k");
    public static final Block WALL_MARKING_LETTER_L = new MarkingWallGeneral("wall_marking_letter_l", "marking_letter_l");
    public static final Block WALL_MARKING_LETTER_M = new MarkingWallGeneral("wall_marking_letter_m", "marking_letter_m");
    public static final Block WALL_MARKING_LETTER_N = new MarkingWallGeneral("wall_marking_letter_n", "marking_letter_n");
    public static final Block WALL_MARKING_LETTER_O = new MarkingWallGeneral("wall_marking_letter_o", "marking_letter_o");
    public static final Block WALL_MARKING_LETTER_P = new MarkingWallGeneral("wall_marking_letter_p", "marking_letter_p");
    public static final Block WALL_MARKING_LETTER_Q = new MarkingWallGeneral("wall_marking_letter_q", "marking_letter_q");
    public static final Block WALL_MARKING_LETTER_R = new MarkingWallGeneral("wall_marking_letter_r", "marking_letter_r");
    public static final Block WALL_MARKING_LETTER_S = new MarkingWallGeneral("wall_marking_letter_s", "marking_letter_s");
    public static final Block WALL_MARKING_LETTER_T = new MarkingWallGeneral("wall_marking_letter_t", "marking_letter_t");
    public static final Block WALL_MARKING_LETTER_U = new MarkingWallGeneral("wall_marking_letter_u", "marking_letter_u");
    public static final Block WALL_MARKING_LETTER_V = new MarkingWallGeneral("wall_marking_letter_v", "marking_letter_v");
    public static final Block WALL_MARKING_LETTER_W = new MarkingWallGeneral("wall_marking_letter_w", "marking_letter_w");
    public static final Block WALL_MARKING_LETTER_X = new MarkingWallGeneral("wall_marking_letter_x", "marking_letter_x");
    public static final Block WALL_MARKING_LETTER_Y = new MarkingWallGeneral("wall_marking_letter_y", "marking_letter_y");
    public static final Block WALL_MARKING_LETTER_Z = new MarkingWallGeneral("wall_marking_letter_z", "marking_letter_z");

    public static final Block WALL_MARKING_FLAG_AGENDER = new MarkingFlag("wall_marking_flag_agender", "marking_flag_agender");
    public static final Block WALL_MARKING_FLAG_ASEXUAL = new MarkingFlag("wall_marking_flag_asexual", "marking_flag_asexual");
    public static final Block WALL_MARKING_FLAG_BISEXUAL = new MarkingFlag("wall_marking_flag_bisexual", "marking_flag_bisexual");
    public static final Block WALL_MARKING_FLAG_INTERSEX = new MarkingFlag("wall_marking_flag_intersex", "marking_flag_intersex");
    public static final Block WALL_MARKING_FLAG_NONBINARY = new MarkingFlag("wall_marking_flag_nonbinary", "marking_flag_nonbinary");
    public static final Block WALL_MARKING_FLAG_PANSEXUAL = new MarkingFlag("wall_marking_flag_pansexual", "marking_flag_pansexual");
    public static final Block WALL_MARKING_FLAG_PRIDE = new MarkingFlag("wall_marking_flag_pride", "marking_flag_pride");
    public static final Block WALL_MARKING_FLAG_POLYAMORY = new MarkingFlag("wall_marking_flag_polyamory", "marking_flag_polyamory");
    public static final Block WALL_MARKING_FLAG_PROGRESSIVE = new MarkingFlag("wall_marking_flag_progressive", "marking_flag_progressive");
    public static final Block WALL_MARKING_FLAG_SAPPHIC = new MarkingFlag("wall_marking_flag_sapphic", "marking_flag_sapphic");
    public static final Block WALL_MARKING_FLAG_TRANS = new MarkingFlag("wall_marking_flag_trans", "marking_flag_trans");
    public static final Block WALL_MARKING_FLAG_VINCIAN = new MarkingFlag("wall_marking_flag_vincian", "marking_flag_vincian");
    public static final Block WALL_MARKING_FLAG_GTNH = new MarkingFlag("wall_marking_flag_gtnh", "marking_flag_GTNH");


    // spotless:on

    public static void registerBlocks() {
        for (Block block : BLOCKS) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }

}
