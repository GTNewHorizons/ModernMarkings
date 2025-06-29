package modernmarkings.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import modernmarkings.blocks.MarkingFloor;
import modernmarkings.blocks.MarkingWall;

public class ModBlocks {

    /**
     * Storing all Mod Blocks in an Array List
     */
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Block> FLOOR_BLOCKS = new ArrayList<>();
    public static final List<Block> WALL_BLOCKS = new ArrayList<>();

    // spotless:off
    public static final Block FLOOR_MARKING_BLACK_SINGLELINE = new MarkingFloor("floor_marking_black_singleline", "marking_black_singleline");

    public static final Block FLOOR_MARKING_WHITE_ARROW = new MarkingFloor("floor_marking_white_arrow", "marking_white_arrow");
    public static final Block FLOOR_MARKING_WHITE_LANE = new MarkingFloor("floor_marking_white_lane", "marking_white_lane");
    public static final Block FLOOR_MARKING_WHITE_LANE_CROSS = new MarkingFloor("floor_marking_white_lane_cross", "marking_white_lane_cross");
    public static final Block FLOOR_MARKING_WHITE_SINGLELINE = new MarkingFloor("floor_marking_white_singleline", "marking_white_singleline");
    public static final Block FLOOR_MARKING_WHITE_SQUARE = new MarkingFloor("floor_marking_white_square", "marking_white_square");
    public static final Block FLOOR_MARKING_WHITEBLACK_HAZARDLINE = new MarkingFloor("floor_marking_whiteblack_hazardline", "marking_whiteblack_hazardline");
    public static final Block FLOOR_MARKING_NOENTRY = new MarkingFloor("floor_marking_noentry", "marking_noentry");
    public static final Block FLOOR_MARKING_NOSTEP = new MarkingFloor("floor_marking_nostep", "marking_nostep");
    public static final Block FLOOR_MARKING_EXIT = new MarkingFloor("floor_marking_exit", "marking_exit");

    public static final Block FLOOR_MARKING_YELLOW_ARROW = new MarkingFloor("floor_marking_yellow_arrow", "marking_yellow_arrow");
    public static final Block FLOOR_MARKING_YELLOW_HAZARDLINE = new MarkingFloor("floor_marking_yellow_hazardline", "marking_yellow_hazardline");
    public static final Block FLOOR_MARKING_YELLOW_LANE = new MarkingFloor("floor_marking_yellow_lane", "marking_yellow_lane");
    public static final Block FLOOR_MARKING_YELLOW_SIDELINE = new MarkingFloor("floor_marking_yellow_sideline", "marking_yellow_sideline");
    public static final Block FLOOR_MARKING_YELLOW_SINGLELINE = new MarkingFloor("floor_marking_yellow_singleline", "marking_yellow_singleline");
    public static final Block FLOOR_MARKING_YELLOW_SQUARE = new MarkingFloor("floor_marking_yellow_square", "marking_yellow_square");
    public static final Block FLOOR_MARKING_YELLOW_STRIPES = new MarkingFloor("floor_marking_yellow_stripes", "marking_yellow_stripes");
    public static final Block FLOOR_MARKING_YELLOW_T_CROSSING = new MarkingFloor("floor_marking_yellow_t_crossing", "marking_yellow_t_crossing");
    public static final Block FLOOR_MARKING_YELLOW_CROSSING = new MarkingFloor("floor_marking_yellow_crossing", "marking_yellow_crossing");
    public static final Block FLOOR_MARKING_YELLOW_TURN = new MarkingFloor("floor_marking_yellow_turn", "marking_yellow_turn");
    public static final Block FLOOR_MARKING_YELLOW_END = new MarkingFloor("floor_marking_yellow_end", "marking_yellow_end");
    public static final Block FLOOR_MARKING_DANGER_YELLOW = new MarkingFloor("floor_marking_danger_yellow", "marking_danger_yellow");

    public static final Block FLOOR_MARKING_WHITE_T_CROSSING = new MarkingFloor("floor_marking_white_t_crossing", "marking_white_t_crossing");
    public static final Block FLOOR_MARKING_WHITE_CROSSING = new MarkingFloor("floor_marking_white_crossing", "marking_white_crossing");
    public static final Block FLOOR_MARKING_WHITE_TURN = new MarkingFloor("floor_marking_white_turn", "marking_white_turn");
    public static final Block FLOOR_MARKING_WHITE_END = new MarkingFloor("floor_marking_white_end", "marking_white_end");
    public static final Block FLOOR_MARKING_WHITE_SIDELINE = new MarkingFloor("floor_marking_white_sideline", "marking_white_sideline");

    public static final Block FLOOR_MARKING_GREEN_T_CROSSING = new MarkingFloor("floor_marking_green_t_crossing", "marking_green_t_crossing");
    public static final Block FLOOR_MARKING_GREEN_CROSSING = new MarkingFloor("floor_marking_green_crossing", "marking_green_crossing");
    public static final Block FLOOR_MARKING_GREEN_TURN = new MarkingFloor("floor_marking_green_turn", "marking_green_turn");
    public static final Block FLOOR_MARKING_GREEN_END = new MarkingFloor("floor_marking_green_end", "marking_green_end");
    public static final Block FLOOR_MARKING_GREEN_SIDELINE = new MarkingFloor("floor_marking_green_sideline", "marking_green_sideline");
    public static final Block FLOOR_MARKING_GREEN_SQUARE = new MarkingFloor("floor_marking_green_square", "marking_green_square");
    public static final Block FLOOR_MARKING_GREEN_HAZARDLINE = new MarkingFloor("floor_marking_green_hazardline", "marking_green_hazardline");
    public static final Block FLOOR_MARKING_GREEN_SINGLELINE = new MarkingFloor("floor_marking_green_singleline", "marking_green_singleline");

    public static final Block FLOOR_MARKING_BLUE_T_CROSSING = new MarkingFloor("floor_marking_blue_t_crossing", "marking_blue_t_crossing");
    public static final Block FLOOR_MARKING_BLUE_CROSSING = new MarkingFloor("floor_marking_blue_crossing", "marking_blue_crossing");
    public static final Block FLOOR_MARKING_BLUE_TURN = new MarkingFloor("floor_marking_blue_turn", "marking_blue_turn");
    public static final Block FLOOR_MARKING_BLUE_END = new MarkingFloor("floor_marking_blue_end", "marking_blue_end");
    public static final Block FLOOR_MARKING_BLUE_SIDELINE = new MarkingFloor("floor_marking_blue_sideline", "marking_blue_sideline");
    public static final Block FLOOR_MARKING_BLUE_SQUARE = new MarkingFloor("floor_marking_blue_square", "marking_blue_square");
    public static final Block FLOOR_MARKING_BLUE_HAZARDLINE = new MarkingFloor("floor_marking_blue_hazardline", "marking_blue_hazardline");
    public static final Block FLOOR_MARKING_BLUE_SINGLELINE = new MarkingFloor("floor_marking_blue_singleline", "marking_blue_singleline");

    public static final Block FLOOR_MARKING_RED_T_CROSSING = new MarkingFloor("floor_marking_red_t_crossing", "marking_red_t_crossing");
    public static final Block FLOOR_MARKING_RED_CROSSING = new MarkingFloor("floor_marking_red_crossing", "marking_red_crossing");
    public static final Block FLOOR_MARKING_RED_TURN = new MarkingFloor("floor_marking_red_turn", "marking_red_turn");
    public static final Block FLOOR_MARKING_RED_END = new MarkingFloor("floor_marking_red_end", "marking_red_end");
    public static final Block FLOOR_MARKING_RED_SIDELINE = new MarkingFloor("floor_marking_red_sideline", "marking_red_sideline");
    public static final Block FLOOR_MARKING_RED_SQUARE = new MarkingFloor("floor_marking_red_square", "marking_red_square");
    public static final Block FLOOR_MARKING_RED_HAZARDLINE = new MarkingFloor("floor_marking_red_hazardline", "marking_red_hazardline");
    public static final Block FLOOR_MARKING_RED_SINGLELINE = new MarkingFloor("floor_marking_red_singleline", "marking_red_singleline");
    public static final Block FLOOR_MARKING_DANGER_RED = new MarkingFloor("floor_marking_danger_red", "marking_danger_red");
    public static final Block FLOOR_MARKING_REDX = new MarkingFloor("floor_marking_redx", "marking_redx");

    public static final Block FLOOR_MARKING_ORANGE_T_CROSSING = new MarkingFloor("floor_marking_orange_t_crossing", "marking_orange_t_crossing");
    public static final Block FLOOR_MARKING_ORANGE_CROSSING = new MarkingFloor("floor_marking_orange_crossing", "marking_orange_crossing");
    public static final Block FLOOR_MARKING_ORANGE_TURN = new MarkingFloor("floor_marking_orange_turn", "marking_orange_turn");
    public static final Block FLOOR_MARKING_ORANGE_END = new MarkingFloor("floor_marking_orange_end", "marking_orange_end");
    public static final Block FLOOR_MARKING_ORANGE_SIDELINE = new MarkingFloor("floor_marking_orange_sideline", "marking_orange_sideline");
    public static final Block FLOOR_MARKING_ORANGE_SQUARE = new MarkingFloor("floor_marking_orange_square", "marking_orange_square");
    public static final Block FLOOR_MARKING_ORANGE_HAZARDLINE = new MarkingFloor("floor_marking_orange_hazardline", "marking_orange_hazardline");
    public static final Block FLOOR_MARKING_ORANGE_SINGLELINE = new MarkingFloor("floor_marking_orange_singleline", "marking_orange_singleline");

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

    public static final Block WALL_MARKING_EXIT = new MarkingWall("wall_marking_exit", "marking_wall_exit");
    public static final Block WALL_MARKING_UNIT = new MarkingWall("wall_marking_unit", "marking_wall_unit");
    public static final Block WALL_MARKING_FIRST_AID = new MarkingWall("wall_marking_first_aid", "marking_wall_first_aid");
    public static final Block WALL_MARKING_FIRE_EXTINGUISHER = new MarkingWall("wall_marking_fire_extinguisher", "marking_wall_fire_extinguisher");
    public static final Block WALL_MARKING_NUMBER_0 = new MarkingWall("wall_marking_number_0", "marking_number_0");
    public static final Block WALL_MARKING_NUMBER_1 = new MarkingWall("wall_marking_number_1", "marking_number_1");
    public static final Block WALL_MARKING_NUMBER_2 = new MarkingWall("wall_marking_number_2", "marking_number_2");
    public static final Block WALL_MARKING_NUMBER_3 = new MarkingWall("wall_marking_number_3", "marking_number_3");
    public static final Block WALL_MARKING_NUMBER_4 = new MarkingWall("wall_marking_number_4", "marking_number_4");
    public static final Block WALL_MARKING_NUMBER_5 = new MarkingWall("wall_marking_number_5", "marking_number_5");
    public static final Block WALL_MARKING_NUMBER_6 = new MarkingWall("wall_marking_number_6", "marking_number_6");
    public static final Block WALL_MARKING_NUMBER_7 = new MarkingWall("wall_marking_number_7", "marking_number_7");
    public static final Block WALL_MARKING_NUMBER_8 = new MarkingWall("wall_marking_number_8", "marking_number_8");
    public static final Block WALL_MARKING_NUMBER_9 = new MarkingWall("wall_marking_number_9", "marking_number_9");
    public static final Block WALL_MARKING_NUMBER_NO = new MarkingWall("wall_marking_number_no", "marking_number_no");
    public static final Block WALL_MARKING_NUMBER_NUMERO = new MarkingWall("wall_marking_number_numero", "marking_number_numero");
    public static final Block WALL_MARKING_NUMBER_DASH = new MarkingWall("wall_marking_number_dash", "marking_number_dash");
    public static final Block WALL_MARKING_NUMBER_COMMA = new MarkingWall("wall_marking_number_comma", "marking_number_comma");
    public static final Block WALL_MARKING_NUMBER_PERIOD = new MarkingWall("wall_marking_number_period", "marking_number_period");
    public static final Block WALL_MARKING_SYMBOL_CHEMICAL = new MarkingWall("wall_marking_symbol_chemical", "marking_wall_symbol_chemical");
    public static final Block WALL_MARKING_SYMBOL_ELECTRIC = new MarkingWall("wall_marking_symbol_electric", "marking_wall_symbol_electric");
    public static final Block WALL_MARKING_SYMBOL_FIRE = new MarkingWall("wall_marking_symbol_fire", "marking_wall_symbol_fire");
    public static final Block WALL_MARKING_SYMBOL_FLUID = new MarkingWall("wall_marking_symbol_fluid", "marking_wall_symbol_fluid");
    public static final Block WALL_MARKING_SYMBOL_FROST = new MarkingWall("wall_marking_symbol_frost", "marking_wall_symbol_frost");
    public static final Block WALL_MARKING_SYMBOL_GEARS = new MarkingWall("wall_marking_symbol_gears", "marking_wall_symbol_gears");
    public static final Block WALL_MARKING_SYMBOL_LASER = new MarkingWall("wall_marking_symbol_laser", "marking_wall_symbol_laser");
    public static final Block WALL_MARKING_SYMBOL_MAGIC = new MarkingWall("wall_marking_symbol_magic", "marking_wall_symbol_magic");
    public static final Block WALL_MARKING_SYMBOL_MOB = new MarkingWall("wall_marking_symbol_mob", "marking_wall_symbol_mob");
    public static final Block WALL_MARKING_SYMBOL_PINCH = new MarkingWall("wall_marking_symbol_pinch", "marking_wall_symbol_pinch");
    public static final Block WALL_MARKING_SYMBOL_PRODUCTION = new MarkingWall("wall_marking_symbol_production", "marking_wall_symbol_production");
    public static final Block WALL_MARKING_SYMBOL_RADIATION = new MarkingWall("wall_marking_symbol_radiation", "marking_wall_symbol_radiation");
    public static final Block WALL_MARKING_SYMBOL_RADIATION_2 = new MarkingWall("wall_marking_symbol_radiation_2", "marking_wall_symbol_radiation_2");
    public static final Block WALL_MARKING_SYMBOL_STORAGE = new MarkingWall("wall_marking_symbol_storage", "marking_wall_symbol_storage");
    public static final Block WALL_MARKING_WARNING_DANGER = new MarkingWall("wall_marking_warning_danger", "marking_wall_warning_danger");
    public static final Block WALL_MARKING_ARROWLEFT = new MarkingWall("wall_marking_arrowleft", "marking_wall_arrowleft");
    public static final Block WALL_MARKING_ARROWRIGHT = new MarkingWall("wall_marking_arrowright", "marking_wall_arrowright");
    public static final Block WALL_MARKING_HAZARDLINE_LEFT = new MarkingWall("wall_marking_hazardline_left", "marking_wall_hazardline_left");
    public static final Block WALL_MARKING_HAZARDLINE_RIGHT = new MarkingWall("wall_marking_hazardline_right", "marking_wall_hazardline_right");
    public static final Block WALL_MARKING_HAZARD_DIAMOND = new MarkingWall("wall_marking_hazard_diamond", "marking_wall_hazard_diamond");

    public static final Block WALL_MARKING_VOLTAGE_EU = new MarkingWall("wall_marking_voltage_eu", "marking_wall_voltage_eu");
    public static final Block WALL_MARKING_VOLTAGE_EV = new MarkingWall("wall_marking_voltage_ev", "marking_wall_voltage_ev");
    public static final Block WALL_MARKING_VOLTAGE_FE = new MarkingWall("wall_marking_voltage_fe", "marking_wall_voltage_fe");
    public static final Block WALL_MARKING_VOLTAGE_HV = new MarkingWall("wall_marking_voltage_hv", "marking_wall_voltage_hv");
    public static final Block WALL_MARKING_VOLTAGE_IV = new MarkingWall("wall_marking_voltage_iv", "marking_wall_voltage_iv");
    public static final Block WALL_MARKING_VOLTAGE_LUV = new MarkingWall("wall_marking_voltage_luv", "marking_wall_voltage_luv");
    public static final Block WALL_MARKING_VOLTAGE_LV = new MarkingWall("wall_marking_voltage_lv", "marking_wall_voltage_lv");
    public static final Block WALL_MARKING_VOLTAGE_MAX = new MarkingWall("wall_marking_voltage_max", "marking_wall_voltage_max");
    public static final Block WALL_MARKING_VOLTAGE_MV = new MarkingWall("wall_marking_voltage_mv", "marking_wall_voltage_mv");
    public static final Block WALL_MARKING_VOLTAGE_PERT = new MarkingWall("wall_marking_voltage_pert", "marking_wall_voltage_pert");
    public static final Block WALL_MARKING_VOLTAGE_RF = new MarkingWall("wall_marking_voltage_rf", "marking_wall_voltage_rf");
    public static final Block WALL_MARKING_VOLTAGE_UEV = new MarkingWall("wall_marking_voltage_uev", "marking_wall_voltage_uev");
    public static final Block WALL_MARKING_VOLTAGE_UHV = new MarkingWall("wall_marking_voltage_uhv", "marking_wall_voltage_uhv");
    public static final Block WALL_MARKING_VOLTAGE_UIV = new MarkingWall("wall_marking_voltage_uiv", "marking_wall_voltage_uiv");
    public static final Block WALL_MARKING_VOLTAGE_UMV = new MarkingWall("wall_marking_voltage_umv", "marking_wall_voltage_umv");
    public static final Block WALL_MARKING_VOLTAGE_UV = new MarkingWall("wall_marking_voltage_uv", "marking_wall_voltage_uv");
    public static final Block WALL_MARKING_VOLTAGE_UXV = new MarkingWall("wall_marking_voltage_uxv", "marking_wall_voltage_uxv");
    public static final Block WALL_MARKING_VOLTAGE_ZPM = new MarkingWall("wall_marking_voltage_zpm", "marking_wall_voltage_zpm");

    public static final Block WALL_MARKING_LETTER_A = new MarkingWall("wall_marking_letter_a", "marking_letter_a");
    public static final Block WALL_MARKING_LETTER_B = new MarkingWall("wall_marking_letter_b", "marking_letter_b");
    public static final Block WALL_MARKING_LETTER_C = new MarkingWall("wall_marking_letter_c", "marking_letter_c");
    public static final Block WALL_MARKING_LETTER_D = new MarkingWall("wall_marking_letter_d", "marking_letter_d");
    public static final Block WALL_MARKING_LETTER_E = new MarkingWall("wall_marking_letter_e", "marking_letter_e");
    public static final Block WALL_MARKING_LETTER_F = new MarkingWall("wall_marking_letter_f", "marking_letter_f");
    public static final Block WALL_MARKING_LETTER_G = new MarkingWall("wall_marking_letter_g", "marking_letter_g");
    public static final Block WALL_MARKING_LETTER_H = new MarkingWall("wall_marking_letter_h", "marking_letter_h");
    public static final Block WALL_MARKING_LETTER_I = new MarkingWall("wall_marking_letter_i", "marking_letter_i");
    public static final Block WALL_MARKING_LETTER_J = new MarkingWall("wall_marking_letter_j", "marking_letter_j");
    public static final Block WALL_MARKING_LETTER_K = new MarkingWall("wall_marking_letter_k", "marking_letter_k");
    public static final Block WALL_MARKING_LETTER_L = new MarkingWall("wall_marking_letter_l", "marking_letter_l");
    public static final Block WALL_MARKING_LETTER_M = new MarkingWall("wall_marking_letter_m", "marking_letter_m");
    public static final Block WALL_MARKING_LETTER_N = new MarkingWall("wall_marking_letter_n", "marking_letter_n");
    public static final Block WALL_MARKING_LETTER_O = new MarkingWall("wall_marking_letter_o", "marking_letter_o");
    public static final Block WALL_MARKING_LETTER_P = new MarkingWall("wall_marking_letter_p", "marking_letter_p");
    public static final Block WALL_MARKING_LETTER_Q = new MarkingWall("wall_marking_letter_q", "marking_letter_q");
    public static final Block WALL_MARKING_LETTER_R = new MarkingWall("wall_marking_letter_r", "marking_letter_r");
    public static final Block WALL_MARKING_LETTER_S = new MarkingWall("wall_marking_letter_s", "marking_letter_s");
    public static final Block WALL_MARKING_LETTER_T = new MarkingWall("wall_marking_letter_t", "marking_letter_t");
    public static final Block WALL_MARKING_LETTER_U = new MarkingWall("wall_marking_letter_u", "marking_letter_u");
    public static final Block WALL_MARKING_LETTER_V = new MarkingWall("wall_marking_letter_v", "marking_letter_v");
    public static final Block WALL_MARKING_LETTER_W = new MarkingWall("wall_marking_letter_w", "marking_letter_w");
    public static final Block WALL_MARKING_LETTER_X = new MarkingWall("wall_marking_letter_x", "marking_letter_x");
    public static final Block WALL_MARKING_LETTER_Y = new MarkingWall("wall_marking_letter_y", "marking_letter_y");
    public static final Block WALL_MARKING_LETTER_Z = new MarkingWall("wall_marking_letter_z", "marking_letter_z");
    // spotless:on

    public static void registerBlocks() {
        for (Block block : BLOCKS) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }

}
